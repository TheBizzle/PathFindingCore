name := "PathFinding"

version := "1.0"

scalaVersion := "2.10.1"

artifactName := { (_, _, _) => "PathFindingCore.jar" }

scalaSource in Compile <<= baseDirectory(_ / "src" / "main")

scalaSource in Test <<= baseDirectory(_ / "src" / "test")

resolvers ++= Seq(
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "com.chuusai" % "shapeless_2.10" % "1.2.3",
  "org.bizzle.tester" % "Tester" % "31b7f32" from
    "https://ccl.northwestern.edu/devel/jason/Tester-31b7f32.jar",
  "org.bizzle.datastructure" % "DataStructure" % "8e9e5ce" from
    "https://ccl.northwestern.edu/devel/jason/DataStructure-8e9e5ce.jar"
)

mainClass in Compile := None
