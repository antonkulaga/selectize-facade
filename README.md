selectize facade
==============

This if a facade of [selectize.js library](http://brianreavis.github.io/selectize.js/).
All the code is inside facade folder (selectize subproject)

[![Gitter chat channel](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/denigma/denigma-libs?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

Usage
=====

In order to resolve a lib you should add a resolver::
```scala
resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases") //add resolver
libraryDependencies += "org.denigma" %%% "selectize-facade" % "0.12.1-0.2.1" //add dependency
```

Gettings started
----------------

You can see an example in preview subproject.

To run preview:
```sbt
    sbt //to opens sbt console
    re-start //Use this command **instead of** run to run the app
    Open localhost:5553 to see the result, it should reload whenever any sources are changed
```
