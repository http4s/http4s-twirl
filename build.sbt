ThisBuild / tlBaseVersion := "1.0"
ThisBuild / developers := List(
  tlGitHubDev("rossabaker", "Ross A. Baker")
)

val Scala213 = "2.13.10"
ThisBuild / crossScalaVersions := Seq(Scala213, "3.3.0")
ThisBuild / scalaVersion := Scala213

lazy val root = project.in(file(".")).aggregate(twirl).enablePlugins(NoPublishPlugin)

val http4sVersion = "1.0.0-M39"
val munitVersion = "0.7.29"
val munitCatsEffectVersion = "2.0.0-M3"

lazy val twirl = project
  .in(file("twirl"))
  .settings(
    name := "http4s-twirl",
    description := "Twirl template support for http4s",
    startYear := Some(2014),
    TwirlKeys.templateImports := Nil,
    libraryDependencies ++= Seq(
      "org.http4s" %%% "http4s-core" % http4sVersion,
      "org.scalameta" %%% "munit-scalacheck" % munitVersion % Test,
      "org.typelevel" %%% "munit-cats-effect" % munitCatsEffectVersion % Test,
      "org.http4s" %%% "http4s-laws" % http4sVersion % Test,
    ),
  )
  .enablePlugins(SbtTwirl)
