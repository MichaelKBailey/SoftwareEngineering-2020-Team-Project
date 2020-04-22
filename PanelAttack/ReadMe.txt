Welcome!

This ReadMe contains information about our project and what you, as a user, need to do
in order for this to work as intended!

Credit where credit is due, my team has worked very hard on getting everything working and
their names (and gitHub account names) are listed below if you are interested in talking
with them:
- - - - - - - - Team Information - - - - - - - -






- - - - - - - - Instructions for .bat Operation - - - - - - - -

Batch files, refered to as ".bat" files, are a type of script file for Windows OS.

.bat files contain a series of commands that, when executed, will perform a task or
a series of task through a command line interpreter.

For this project, the included .bat files are simple one line commands that call on
the "ocsf.jar" file to establish the Client and Server components for the project.

To START:

1.) You need some form of MySql running (our class used xampp).
You can run the "GameDatabase.sql" which will create the GameUsers table which stores
Usernames and Passwords for your users.

2.) Once the Database portion is in place, the next step is to run the "Server.bat" file 
to establish a server capable of "listening" for client connections.

3.) Run the "Client.bat" file to connect to the newly created server and its associated
back end database.

