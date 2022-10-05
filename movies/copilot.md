Preserve Order of File Creation
================
This has great effect on the api ability to do code completion.

Movie Model
=================
```aidl
/*
        {
            "adult": false,
            "backdrop_path": "/5GA3vV1aWWHTSDO5eno8V5zDo8r.jpg",
            "genre_ids": [
                27,
                53
            ],
            "id": 760161,
            "original_language": "en",
            "original_title": "Orphan: First Kill",
            "overview": "After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.",
            "popularity": 7115.298,
            "poster_path": "/wSqAXL1EHVJ3MOnJzMhUngc8gFs.jpg",
            "release_date": "2022-07-27",
            "title": "Orphan: First Kill",
            "video": false,
            "vote_average": 7,
            "vote_count": 797
        }
 */
// create a new entity class called Movie based on the json above and create the getters and setters for the fields.
// Give the id field the @Id annotation and the @GeneratedValue annotation with the strategy of GenerationType.AUTO
@Entity
```
note :: didnt fully complete the file. had to press tab several times to get the code completion to work.

Movies Controller
=================
```aidl
// create a new controller with a method named getLatest that is a GET method
// this method fetches the latest movies from https://api.themoviedb.org/3/movie/latest and uses an api parameter
// named api_key with the value of the environment variable MOVIE_API_KEY. The method returns a json object
// with all the movies in it
@Controller

```
