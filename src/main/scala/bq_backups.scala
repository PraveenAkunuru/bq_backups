import com.google.cloud.spark.bigquery._
import org.apache.spark.sql.SparkSession


object bq_backups {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .appName("BigQuery_Backup_Restore")
      .getOrCreate()

    // Load data in from BigQuery.
    val df = spark.read.format("com.google.cloud.spark.bigquery").option("table","pakunuru-sandbox.tpch10tb.customer").load()


    // Write to GCS
    spark.time(df.write.parquet("gs://benchmark-gcs-pakunuru-sandbox/pakunuru-sandbox/tpch10tb/customer3/"))

  }
}
