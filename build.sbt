name := "scalajs-blockadblock"

normalizedName := "scalajs-blockadblock"

version := "0.3"

scalaVersion := "2.11.7"

enablePlugins(ScalaJSPlugin)

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

jsDependencies += "org.webjars.bower" % "blockadblock" % "3.2.0" / "blockadblock.js"