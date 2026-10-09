@echo off
cd /d "C:\Users\abhis\Downloads\codes\AdvJava\JDBC_CODES"
javac -cp ".;ojdbc14.jar" MySQLTest.java
java -cp ".;ojdbc14.jar" MySQLTest
pause
