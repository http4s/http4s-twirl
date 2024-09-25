ThisBuild / tlBaseVersion := "0.23"
ThisBuild / tlMimaPreviousVersions ++= (0 to 11).map(y => s"0.23.$y").toSet
ThisBuild / developers := List(
  tlGitHubDev("rossabaker", "Ross A. Baker")
)
ThisBuild / startYear := Some(2014)

val Scala213 = "2.13.15"
ThisBuild / crossScalaVersions := Seq("2.12.19", Scala213)
ThisBuild / scalaVersion := Scala213

lazy val root = project.in(file(".")).aggregate(twirl).enablePlugins(NoPublishPlugin)

val http4sVersion = "0.23.27"
val munitVersion = "1.0.0"
val munitCatsEffectVersion = "2.0.0"

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
