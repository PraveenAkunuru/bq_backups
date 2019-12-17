name := "bq_backups"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq (
  "org.apache.spark" %% "spark-core" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.4.0" % "provided",
  "com.google.cloud.spark" %% "spark-bigquery" % "0.10.0-beta"
)

