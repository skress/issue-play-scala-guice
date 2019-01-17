This project shows problems with https://github.com/codingwell/scala-guice at version 4.2.2 and Play framework's dev mode.

Clone this project, start Play via `sbt run` and point your browser to http://localhost:9000. You will see an exception.

Now downgrade the dependency to scala-guice in build.sbt to version 4.2.1. Cancel `sbt`, restart and reload.

