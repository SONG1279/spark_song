name := "spark_song"

version := "0.1"

scalaVersion := "2.11.12"



libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.1"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.1"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.1"

libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.3.1"

libraryDependencies += "org.apache.spark" %% "spark-graphx" % "2.3.1"

libraryDependencies += "junit" % "junit" % "4.12"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.0.0"
