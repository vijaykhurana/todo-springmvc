//SOME svn COMMANDS
svn checkout http://todo-springmvc.googlecode.com/svn/trunk/ myFolderToDo
svn import https://todo-springmvc.googlecode.com/svn/trunk --username mygoogleacc --password myGoogleCodeDotComPasswd
svn commit myFile https://todo-springmvc.googlecode.com/svn/trunk/myFolder --username mygoogleacc

//SOME mvn COMMANDS
mvn eclipse:eclipse
mvn clean package
mvn install -Dmaven.test.skip=true

//CODING CONVENTION
+ generally Sun - http://java.sun.com/docs/codeconv/html/CodeConvTOC.doc.html
+ 3 spaces as unit indentation, each tab is replaced by 3 spaces also
+ wrap lines longer than 120 chars, 1 space before condition and open brace
+ open brace as same line, close brace next newline (else, catch, finally, etc)
+ follow best practices: KISS, YAGNI, DRY, DRW, CoC, Open-Close OOP, etc
+ inform others before modifying their code

//DATABASE CONFIGURATION todo-web.properties, applicationContext.xml, pom.xml
+ default DB: MySQL 'todo' (app) and 'todo_test' (test)
+ can be switched to PostgreSQL, SQLite, Oracle, DB2, SqlServer, etc

//FEEDBACK - mailto:quoc383011@gmail.com
