# rest-demo

A very simple API server using Lein, HTTPKit, Compojure, Ring Middleware

## Installation

Assumes you have istalled leineigen already.

1. Clone this repository
2. cd into the cloned repo
3. `lein run`

## Endpoints

```
GET / --> Returns "Hello, world"
```
```
GET /request --> Returns the request object itself
```