package mali.copilot.movies;
// create a new controller with a method named getPopular that is a GET method
// this method has an @RequestParam named popular, this method returns a list of Movies objects
// It first fetches the data from https://api.themoviedb.org/3/movie/popular with a query parameter api_key,
// the value is from the enviornment variable MOVIE_API_KEY
// then it parses the JSON response and returns a list of Movies objects
@Controller
public class MoviesController {
    @GetMapping("/movies")
    public List<Movies> getPopular(@RequestParam String popular) {
        // create a new RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        // create a new HttpHeaders object
        HttpHeaders headers = new HttpHeaders();
        // add the header "Accept" with the value "application/json"
        headers.add("Accept", "application/json");
        // create a new HttpEntity object with the headers
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        // create a new ResponseEntity object with the return value of the exchange method
        // the exchange method takes the url, the http method, the entity, and the class of the object to return
        ResponseEntity<String> response = restTemplate.exchange("https://api.themoviedb.org/3/movie/popular?api_key=" + System.getenv("MOVIE_API_KEY"), HttpMethod.GET, entity, String.class);
        // create a new ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        // create a new JsonNode object with the return value of the readTree method
        // the readTree method takes the response body
        JsonNode root = mapper.readTree(response.getBody());
        // create a new JsonNode object with the return value of the get method
        // the get method takes the key "results"
        JsonNode results = root.get("results");
        // create a new ArrayList of Movies objects
        List<Movies> movies = new ArrayList<>();
        // loop through the results
        for (JsonNode result : results) {
            // create a new Movies object with the return value of the readValue method
            // the readValue method takes the result and the class of the object to return
            Movies movie = mapper.readValue(result.toString(), Movies.class);
            // add the movie to the list
            movies.add(movie);
        }
        // return the list
        return movies;
    }
}