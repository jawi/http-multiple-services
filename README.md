# http-multiple-services

Example project showing how to register JAXRS services to different HTTP services

## Usage

Run the `local.bndrun` as regular OSGi application.

There are two applications running: one on `http://localhost:9090/admin` and one
on `http://localhost:8080/user`. The resources do not "bleed" to the other whiteboard
contexts.

## How it works

There are two HTTP services configured/registered, one listening on port 9090 and
one on port 8080. There are also two `ServletContextHelper`s, one for each port,
that separate the resources that are registered with them, see the 
`HTTP_WHITEBOARD_TARGET` property that accepts an OSGi filter clause to select
which (target) HTTP service should be used for the registration.
