**Movie Characters API**
-
* Bulit with: 
Java 16 and
Postgres with PgAdmin

Brief about the Project
-
This is a Spring Web project using Java and compromising database made in PostgresSQL
 through Hibernate with REST API, The database will store data about the characters, movies they appear in,
and the franchises this movies belong to.

Models:
-
 * Character
 * Movies 
 * Franchise

API requirements:
-
###### Characters

* GET all Characters : /api/v1/characters
* Add Character : /api/v1/characters
* GET Character byId : /api/v1/characters/{id}
* Update Character  : /api/v1/characters/{id}
* Delete Character  : /api/v1/characters/{id}

###### Movies

* GET all Movies :  /api/v1/movies
* Add a Movie : /api/v1/movies
* GET Movie byId : /api/v1/movies/{id}
* Update Movie   : /api/v1/movies/{id}
* Delete Movie  : /api/v1/movies/{id}
* Update character in a movie : /api/v1/movies/{id}/characters
* GET all characters in a moive : /api/v1/movies/getAllCharactersInMovie/{id}

###### Franchises

* Update movie in franchise: /api/v1/franchises/{id}/movies
* GET all movies in a franchise : /api/v1/farnchises/{id}/getAllMoviesInFranchises
* Get all charachters in a franchise : /api/v1/farnchises/{id}/getAllCharactersInFranchise


## Authors
- [Hamza Farah](https://github.com/Hamza1001101)
- [Jaber Ali](https://github.com/Jaber-Ali)

