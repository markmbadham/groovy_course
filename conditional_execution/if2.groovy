age = System.console().readLine('What is your age? ').toInteger()

if (age <=0) println "invalid age"
else if (age <=1) println "baby"
else if (age <=13) println "child"
else if (age <=18) println "teen"
else if (age <=120) println "adult"
else  println " I don't believe you"