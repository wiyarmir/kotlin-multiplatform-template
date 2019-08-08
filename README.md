[![CircleCI Badge](https://circleci.com/gh/wiyarmir/kotlin-multiplatform-template.svg?style=svg)](https://circleci.com/gh/wiyarmir/kotlin-multiplatform-template)
![Kotlin Version](https://img.shields.io/badge/kotlin-v1.3.40-F88909?style=flat&logo=kotlin)

# Kotlin Multiplatform Template

Template that will give you a ready-to-go project including:

- Backend project with Ktor at [backend/](/backend)
- Frontend project with KotlinJS and React Kotlin at [web/](/web)
- Android App project with KotlinJVM at [android/](/android)
- iOS App project with KotlinNative at [ios/](/ios)
- Shared network, domain and presentation at [common/](/common)

*Looking for a project with just Android and iOS? It's here: https://github.com/wiyarmir/kotlin-multiplatform-mobile-template*

*Looking for a project with just Backend and Web? It's here: https://github.com/wiyarmir/kotlin-multiplatform-frontend-template*

## Building and running the project

### Backend

There is a Gradle task that will produce a JAR ready to go.

```bash
$ ./gradlew stage
```

The output is in `backend/build/libs/backend-release.jar`.

The following environment variables are recognised:

| Name | Value |
|------|-------|
| PORT | Port where the server will run and listen to incoming connections |
| ENVIRONMENT | Can be either `production` or `development`. If absent, will assume `development`. |

You can run the backend development server executing:

```bash
$ ./gradlew backend:run
```

This will start serving the app in port 9090 by default. 

### Web

If you want to run the frontend development server, you can execute:

```bash
$ ./gradlew web:run
```

This will start the webpack development server in port 8080, and proxy all calls to files it doesn't know to port 9090.

If you want the frontend development server to connect to the development backend, you'll need to pass the flag `-Pdebug`.

```bash
$ ./gradlew web:run -Pdebug
```

**Warning**: The webpack development server will keep running until you execute `./gradlew web:stop`.

#### Hot reloading

In backend, Ktor supports hot reloading, but since the task serving the app is kept alive, you need to execute in a separate console:

```bash
$ ./gradlew backend:classes -t
```

This will recompilate classes on file changes, and Ktor will detect it and reload them on the next request it serves.

For the frontend, it's enough to execute the original run task with `-t` flag.

```bash
$ ./gradlew web:run -t
```

### Android

Open the root project in Android Studio or IntelliJ, and it will recognise the Android App configuration after a
successful Gradle sync. You can use that configuration to run, debug and profile the app.

### iOS

Open the workspace located at [ios/KotlinMultiplatformTemplate.xcworkspace](/ios/KotlinMultiplatformTemplate.xcworkspace) 
in XCode. The Podfile includes an entry to the common code with an extra user script for it to be recompiled as a build 
step.

## Deployment

### Backend

There is a `Procfile` that will JustWork™️ on Heroku or Herokuish environments (think [Dokku](https://github.com/dokku/dokku)).

### Frontend

By default, the web bundle and a default `index.html` are included in the backend jar and served at `/`.

## Contributing

If you would like to contribute code to this repository you can do so through GitHub by creating a new branch in the repository and sending a pull request or opening an issue. Please, remember that there are some requirements you have to pass before accepting your contribution:

* Write clean code and test it.
* The code written will have to match the product owner requirements.
* Follow the repository code style.
* Write good commit messages.
* Do not send pull requests without checking if the project build is OK in the CI environment.
* Review if your changes affects the repository documentation and update it.
* Describe the PR content and don't hesitate to add comments to explain us why you've added or changed something.

## License

    Copyright 2019 Kotlin Multiplatform Template

    Licensed under the Apache License, Version 2.0 (the "License"); you may 
    not use this file except in compliance with the License. You may obtain a 
    copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
    License for the specific language governing permissions and limitations 
    under the License.
