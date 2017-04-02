# Observer Pattern Example
## 1. Statement of the Work

Some people who are interested in football need to always follow match results and live scores. Some people do it because they play games of chance, while others do it to follow the game because they can not watch.
Today, there are many live score mobile applications that offer this type of service. “Match Scores” are one of those applications that show the scores of football matches live. Users can follow live scores from this application. In addition to this, users can add their favorite matches and get notifications of goals scored in the matches and results of the first half and match. In this way, users do not need to always look into the application and they can get instant notifications when there is a score changing on their favorites’ matches.

## 2. Class Diagram
![uml](https://cloud.githubusercontent.com/assets/21054424/24585938/ff41981e-179e-11e7-957b-9f94d7b13d88.png)

## 3. Proposed Pattern
The first time I heard Observer Pattern, I was very interested because I thought many places could be used today. I did some research on the internet for this and I saw that you really used every field. I chose the observer pattern because I thought I will often use this pattern in the future.
In my solution, users can get immediate notification from the following matches when there is a score change. To do this, I think each match is a subject, because more than one user may want to follow a match. In the same way, I thought of each user as an observer.
I have 3 methods to perform notification such as setScore(), setFirstHalfMatchScore() and setMatchScore(). These methods hold score values and notify interested observers when there is a score change. Display() method is used to print goal notifications, the first-half result and the match result on the screen.
