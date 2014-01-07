name := "PathFindingCore"

organization := "org.bizzle"

version := "1.0"

scalaVersion := "2.10.1"

licenses += ("BSD", url("http://choosealicense.com/licenses/bsd-3-clause/"))

scalaSource in Compile <<= baseDirectory(_ / "src" / "main")

scalaSource in Test <<= baseDirectory(_ / "src" / "test")

seq(bintraySettings: _*)

bintray.Keys.repository in bintray.Keys.bintray := "PathFindingCore"

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("thebizzle")

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
