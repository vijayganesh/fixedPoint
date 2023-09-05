ThisBuild / version := "0.1.0-SNAPSHOT"

//ThisBuild / scalaVersion := "2.13.11"
ThisBuild / scalaVersion := "2.12.1"
lazy val root = (project in file("."))
  .settings(
    name := "fixedPoint",
    idePackagePrefix := Some("org.vricsa")
  )
