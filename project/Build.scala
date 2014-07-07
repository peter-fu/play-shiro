import sbt._
import Keys._

import play.Project._

object ApplicationBuild extends Build {

  val appName = "play-shiro"
  val appVersion = "1.0.2"

  val appDependencies = Seq(
    jdbc,
    anorm,
    "org.jasypt" % "jasypt" % "1.7",
    "org.apache.shiro" % "shiro-core" % "1.2.1"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Apache Snapshot repository" at "https://repository.apache.org/content/repositories/snapshots/"
  )

}
