# Stay
Airbnb clone written in Java using Spring Boot framework

## Technologies 
- Spring Boot 1.5.9
- JDK 8: [Download here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- Gradle 4.4.1: not required, wrapper included

## Run this program
* Ensure that run.sh is executable: `chmod +x run.sh`
* Run the server: `./run.sh`  
* Run tests: `gradle test -i` (i is for interactive output)
* Open in browser: `http://localhost:8080/`
* View a city: `http://localhost:8080/search?city=NYC`

## API Endpoints
|Endpoint                      | Description                  | Example
|------------------------------|------------------------------|------------
| GET /api/search/             | returns default city as json | http://localhost:8080/api/search/
| GET /api/search?city=:city   | returns custom city as json  | http://localhost:8080/api/search?city=SanFrancisco