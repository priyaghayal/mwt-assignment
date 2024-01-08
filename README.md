## Front-End command
```
npm install
npm start
```

## MySQL Install command
```
docker pull mysql
docker run -p 3307:3306 --name mysqlcontainer -e MYSQL_ROOT_PASSQORD=root -e MYSQL_DATABASE=user -d mysql
```
## Network command
```
docker network create networkmysql
docker network connect networkmysl mysqlcontainer
```
## Backend command
```
docker build -t userbackend .
docker run -p 8090:8080 --name backendcontainer --net networkmysql -e MYSQL_HOST=mysqlcontainer -e MYSQL_PORT=3306 -e MYSQL_DB_NAME=user -e MYSQL_USER=root -e MYSQL_PASSWORd=root userbackend
```
