name := "amazonMWS-scalaxb-2.12"

version := "0.1"

scalaVersion := "2.12.13"


val monocleCore = "com.github.julien-truffaut" %% "monocle-core"  % "2.0.3"
// val monocleMacro = "com.github.julien-truffaut" %% "monocle-macro" % "2.0.3"
val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.3.0"
val scalaParser = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
val dispatchV = "0.12.0"
val dispatch = "net.databinder.dispatch" %% "dispatch-core" % dispatchV

ThisBuild / organization  := "com.example"
ThisBuild / scalaVersion  := "2.12.8"

lazy val root = (project in file("."))
  .enablePlugins(ScalaxbPlugin)
  .settings(
    name          := "foo",
    libraryDependencies ++= Seq(dispatch, scalaXml, scalaParser, monocleCore),
    Compile / scalaxb / scalaxbDispatchVersion := dispatchV,
    Compile / scalaxb / scalaxbPackageName := "com.amazon.mws",
    Compile / scalaxb / scalaxbGenerateLens := true,
    Compile / scalaxb / scalaxbUseLists := true
  )