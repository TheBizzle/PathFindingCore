name := "PathFinding"

version := "0.7"

scalaVersion := "2.10.0"

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
    "https://www.dropbox.com/s/nf2uwp8mz979rw0/Tester-e875882.jar",
  "org.bizzle.datastructure" % "DataStructure" % "8e9e5ce" from
    "https://www.dropbox.com/s/yxk0u4h03jtkmbe/DataStructure-8e9e5ce.jar"
)

mainClass in Compile := None
