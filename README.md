# Brawlhalla-API-Client
A client for accessing the brawlhalla API

## Building

Before building you must first copy the `settings.testing.example` file
to `settings.testing` and replace the contents with your API key.
This file is necessary as some tests are run against the brawlhalla servers
and thus authorization is required to do so.

In order to build this library, simply run

`./gradlew build`