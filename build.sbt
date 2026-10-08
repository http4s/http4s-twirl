ThisBuild / tlBaseVersion := "1.0"
ThisBuild / developers := List(
  tlGitHubDev("rossabaker", "Ross A. Baker")
)
ThisBuild / startYear := Some(2014)

val Scala213 = "2.13.18"
ThisBuild / crossScalaVersions := Seq(Scala213, "3.3.8")
ThisBuild / scalaVersion := Scala213

lazy val root = project.in(file(".")).aggregate(twirl).enablePlugins(NoPublishPlugin)

val http4sVersion = "1.0.0-M49"
val munitVersion = "1.3.1"
val munitCatsEffectVersion = "2.2.1"

lazy val twirl = project
  .in(file("twirl"))
  .settings(
    name := "http4s-twirl",
    description := "Twirl template support for http4s",
    TwirlKeys.templateImports := Nil,
    libraryDependencies ++= Seq(
      "org.http4s" %%% "http4s-core" % http4sVersion,
      "org.scalameta" %%% "munit-scalacheck" % munitVersion % Test,
      "org.typelevel" %%% "munit-cats-effect" % munitCatsEffectVersion % Test,
      "org.http4s" %%% "http4s-laws" % http4sVersion % Test,
    ),
  )
  .enablePlugins(SbtTwirl)
