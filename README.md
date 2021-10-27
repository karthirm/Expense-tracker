# Expense Tracker REST API

This repository contains source code which is used to build a REST API with Spring Boot for the expense tracker application

Technologies Used - Spring Boot, Mongo DB.

API has been documented using Swagger and Springfox, can be checked in below URLs
http://localhost:8090/swagger-ui/
http://localhost:8090/v2/api-docs

Postman can be used to test the API which includes the HTTP operations (GET, DELETE, POST, PUT)
URL's can be found in the above swagger documentation link.

For the uninitiated, Mongodb is running in port 27017 under the database "expense-tracker" and collection "expense".
Below are the commands that have to be used to verify the data present in Mongo collection.

1. sudo mongod  -- run in a terminal or command prompt
2. Mongo -- run in a separate terminal
3. show databases  -- list all databases available
4. use expense-tracker  -- use our schema
5. show collections  -- list all collections
6. show tables   -- list all the tables
7. db.getCollectionNames()  -- show expense as collection
8. db.expense.find() -- show all the entries inserted via Postman
