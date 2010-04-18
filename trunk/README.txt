//TO CHECKOUT THE SOURCE CODE FROM THE TRUNK
svn checkout http://todo-springmvc.googlecode.com/svn/trunk/ myFolderToDo

//TO CONVERT TO ECLIPSE PROJECT (AND DOWNLOAD DEPENDENCIES)
mvn eclipse:eclipse

//TO BUILD THE WAR
mvn clean package

//TO INSTALL TO MAVEN LOCAL REPOS
mvn install -Dmaven.test.skip=true

//TO IMPORT (ADD NEW) A FOLDER RECURSIVELY
svn import myFolder https://todo-springmvc.googlecode.com/svn/trunk/myFolder --username mygoogleacc --password myGoogleCodeDotComPasswd

//TO CHECKIN (COMMIT) A FILE 
svn commit myFile https://todo-springmvc.googlecode.com/svn/trunk/myFolder  --username mygoogleacc --password myGoogleCodeDotComPasswd

//TO BECOME A CONTRIBUTOR FOR THIS PROJECT
mailto:quoc383011@gmail.com


