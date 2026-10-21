// Build file for Programs 18-25 (Programming for Data Science Lab - Scala)
// Run any program from the VS Code terminal, e.g.
//   sbt "runMain Program18_ArraysInScala"
//   sbt "runMain Program23_SaddleVegas"
name         := "pds-lab-scala"
version      := "1.0"
scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.scala-saddle" %% "saddle-core"   % "1.3.4",   // Programs 23, 25
  "org.vegas-viz"    %% "vegas"         % "0.3.11",  // Programs 23, 25
  "org.scalanlp"     %% "breeze"        % "0.13.2",  // Program 24
  "org.plotly-scala" %% "plotly-render" % "0.5.4",   // Program 24
  "org.spire-math"   %% "spire"         % "0.13.0"   // Program 25
)

// run programs in a separate JVM from the project folder (so fruit_prices.csv is found)
fork := true
