# adding wind turbines
curl -d "name=CK400&latitude=43.87&longitude=28.38" -X POST http://localhost:8080/demo/addWind
curl -d "name=CK510&latitude=43.872&longitude=28.54" -X POST http://localhost:8080/demo/addWind
curl -d "name=CL380&latitude=44.67&longitude=28.28" -X POST http://localhost:8080/demo/addWind

# adding data to wind turbines
curl -d "windTurbineName=CK400&time=2019-01-01%2015:30:00.0&value=300" -X POST http://localhost:8080/demo/dataWind
curl -d "windTurbineName=CK400&time=2019-01-02%2015:30:00.0&value=280" -X POST http://localhost:8080/demo/dataWind
curl -d "windTurbineName=CK400&time=2019-01-03%2015:30:00.0&value=300" -X POST http://localhost:8080/demo/dataWind
curl -d "windTurbineName=CK400&time=2019-01-04%2015:30:00.0&value=300" -X POST http://localhost:8080/demo/dataWind

curl -d "windTurbineName=CK510&time=2019-01-01%2015:30:00.0&value=500" -X POST http://localhost:8080/demo/dataWind
curl -d "windTurbineName=CK510&time=2019-01-02%2015:30:00.0&value=380" -X POST http://localhost:8080/demo/dataWind
curl -d "windTurbineName=CK510&time=2019-01-03%2015:30:00.0&value=550" -X POST http://localhost:8080/demo/dataWind
curl -d "windTurbineName=CK510&time=2019-01-04%2015:30:00.0&value=520" -X POST http://localhost:8080/demo/dataWind
curl -d "windTurbineName=CK510&time=2019-01-05%2015:30:00.0&value=500" -X POST http://localhost:8080/demo/dataWind
