import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-shiro"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      "org.jasypt" % "jasypt" % "1.7",
      "org.apache.shiro" % "shiro-core" % "1.2.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
       resolvers += "Apache Snapshot repository" at "https://repository.apache.org/content/repositories/snapshots/"
    )

}
