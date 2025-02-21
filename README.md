# Sample Spring Boot App

A sample spring boot app for interview and review purposes

## How to build

You'll need at least the version of Java specified in [.tool-versions](.tool-versions) installed.
Consider using [mise-en-place](https://mise.jdx.dev/) or [asdf](https://asdf-vm.com/) to manage your java (and everything else!) versions.

You can build and test the app:

```shell
./gradlew build
```

## How to run

You can run the app, but it doesn't do anything:

```shell
./gradlew bootRun
```

or, to use a specific profile, e.g. local:

```shell
./gradlew bootRun --args='--spring.profiles.active=local'
```

## How to interact with the application

Once up and running, use the [postman collection](./postman) to send a request to the application.
