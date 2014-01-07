name := "PathFinding"

version := "1.0"

scalaVersion := "2.10.1"

artifactName := { (_, _, _) => "PathFindingCore.jar" }

scalaSource in Compile <<= baseDirectory(_ / "src" / "main")

scalaSource in Test <<= baseDirectory(_ / "src" / "test")

seq(bintraySettings: _*)

resolvers ++= Seq(
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  bintray.Opts.resolver.repo("thebizzle", "DataStructure"),
  bintray.Opts.resolver.repo("thebizzle", "Tester")
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "com.chuusai" % "shapeless_2.10" % "1.2.3",
  "org.bizzle" %% "tester" % "1.0",
  "org.bizzle" %% "datastructure" % "0.7"
)

mainClass in Compile := None
