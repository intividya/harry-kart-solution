# Harry-Kart
## Description
Harry-Kart in a special kind of horse racing.

The horses participating have a base speed, they can run with that speed indefinitely.
The track is a 1000 meters loop and is divided in lanes, each horse runs on a lane and every lane has the same length.   
The horses run the first loop at their base speed but at the end of each loop they find a power-up or power-down.

The power-ups/downs are numbers, negative or positive, representing how much the horse speeds up or slows down.

Your task is to compute the top 3 ranking.

## Example 1

### Input

**Number of loops:** 3

**Start List:**

| Lane | Horse name     | Base speed |
|------|----------------|------------|
| 1    | TIMETOBELUCKY  | 10         |
| 2    | CARGO DOOR     | 10         |
| 3    | HERCULES BOKO  | 10         |
| 4    | WAIKIKI SILVIO | 10         |

**Power-Ups/Downs:**

| Loop | Lane 1 | Lane 2 | Lane 3 | Lane 4 |
|------|--------|--------|--------|--------|
| 1    | 1      | 1      | 0      | -2     |
| 2    | 1      | -1     | 2      | -2     |

### Result

| Position | Horse Name    |
|----------|---------------|
| 1st      | TIMETOBELUCKY |
| 2nd      | HERCULES BOKO |
| 3rd      | CARGO DOOR    |


## Example 2

### Input

**Number of loops:** 3

**Start List:**

| Lane | Horse name     | Base speed |
|------|----------------|------------|
| 1    | TIMETOBELUCKY  | 10         |
| 2    | CARGO DOOR     | 10         |
| 3    | HERCULES BOKO  | 10         |
| 4    | WAIKIKI SILVIO | 10         |

**Power-Ups/Downs:**

| Loop | Lane 1 | Lane 2 | Lane 3 | Lane 4 |
|------|--------|--------|--------|--------|
| 1    | 0      | 0      | 1      | 3      |
| 2    | 10     | 0      | 0      | 1      |

### Result

| Position | Horse Name    |
|----------|---------------|
| 1st      | WAIKIKI SILVIO|
| 2nd      | TIMETOBELUCKY |
| 3rd      | HERCULES BOKO |


## Example 3

### Input

**Number of loops:** 3

**Start List:**

| Lane | Horse name     | Base speed |
|------|----------------|------------|
| 1    | TIMETOBELUCKY  | 10         |
| 2    | CARGO DOOR     | 10         |
| 3    | HERCULES BOKO  | 10         |
| 4    | WAIKIKI SILVIO | 10         |

**Power-Ups/Downs:**

| Loop | Lane 1 | Lane 2 | Lane 3 | Lane 4 |
|------|--------|--------|--------|--------|
| 1    | 6      | 10     | 4      | 0      |
| 2    | 0      | -10    | 5      | 15     |

### Result

| Position | Horse Name    |
|----------|---------------|
| 1st      | HERCULES BOKO |
| 2nd      | TIMETOBELUCKY |
| 3rd      | WAIKIKI SILVIO|

## Implementation
The assignment has to be implemented as a spring boot application. Here you will find a boilerplate application implemented in both Java and Kotlin, choose whichever of the two you prefer. Feel free to delete the files you don't need.
We have set the java version to 15, but you are not required to use Java 15. You can in fact set a lower Java version if you prefer, however Java 8 is minimum. Please note that the boilerplate uses the text blocks feature from Java 15 (so you might have to remove that piece of code first).

The input is provided as an XML document (see examples ```/src/main/resources/input_0.xml```, ```/src/main/resources/input_1.xml``` and ```/src/main/resources/input_2.xml```),
in case you need it we provide the XML schema for it (```/src/main/resources/input.xsd```)

The output must be a json document of this form:
```json
{
   "ranking": [
      {"position": 1, "horse": "TIMETOBELUCKY"},
      {"position": 2, "horse": "HERCULES BOKO"},
      {"position": 3, "horse": "CARGO DOOR"}
   ]
}
```

The application we provide has two rest endpoints accepting XML and returning JSON (http://localhost:8080/java/api/play and http://localhost:8080/kotlin/api/play), you can use any of them as entry point.

When you are done, zip the project (without the target folder) and send it back to us. You can leave the .git folder if you want.
