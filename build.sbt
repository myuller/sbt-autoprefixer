sbtPlugin := true

organization := "net.matthewrennie.sbt"

name := "sbt-autoprefixer"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.10"

resolvers ++= Seq(
  "Typesafe Releases Repository" at "https://repo.typesafe.com/typesafe/releases/",
  Resolver.url("sbt snapshot plugins", url("https://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns),
  Resolver.sonatypeRepo("snapshots"),
  "Typesafe Snapshots Repository" at "https://repo.typesafe.com/typesafe/snapshots/",
  "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
)

addSbtPlugin("com.typesafe.sbt" %% "sbt-js-engine" % "1.2.2")

dependencyOverrides += "com.typesafe.sbt" % "sbt-web" % "1.4.3"
