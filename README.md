# Mars Rover API
To use the Mars Rover API:  

GET /marsrover/status : Obtain the status of Mars Rover  
GET /marsrover/position : Obtain the actual position of Mars Rover  
PUT /marsrover/position : Move the Mars Rover to new position  

Position JSON to use in PUT:  

``` [json]
{
    "latidude": 1.1
    "longitude": 30.65
}
```
