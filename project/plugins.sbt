// https://github.com/sbt/sbt/issues/6997
ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always

addSbtPlugin("org.http4s" % "sbt-http4s-org" % "0.14.9")
addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.5.1")
