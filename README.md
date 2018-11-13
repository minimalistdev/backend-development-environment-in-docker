# Backend Development Environment in Docker

## Requirements

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Environment Variables

```
DB_PORT={mongoPort}
DB_HOST={mongoHost}
DB_NAME={dbName}
```

## Running

```shell
gradle bootRun
```

## Running on docker-compose

On root, run

```shell
docker-compose up
```

to rebuild

```shell
docker-compose up --build
```