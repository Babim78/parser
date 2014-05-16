1.install maven 3

2.install jdk 1.7

3.if not described environment variables to maven and jdk:

for maven

Computer->properties->additional parameters of the system->environment variables->
->system variables->create-> variable 'M2_HOME' value 'path to Maven 3'

for java

Computer->properties->additional parameters of the system->environment variables->
->system variables->create-> variable 'JAVA_HOME' value 'path to jdk 1.7'

for java and maven

Computer->properties->additional parameters of the system->environment variables->
->system variables->Path->edit->to the end of the string after ; add path to folder bin
jdk 1.7 and path to maven bin folder.

4.unzip the file to a folder 'parser'

5.open cmd

6.in cmd go into the folder 'parser'

7.input command 'mvn package' enter

8.go into the folder 'target'

9.input command 'java -jar parse-1.0.jar' enter

10.application will run and appears the string 'input string...'

11.enter the string

12.if the string is correct, we get the string representation of the object

13.if the string is incorrect, we get exception

14.to exit programme enter 'end'