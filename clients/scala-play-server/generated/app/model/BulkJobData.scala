package model

import play.api.libs.json._

/**
  * Bulk request result data.
  * @param resultUrl Presigned s3 file url for the bulk request result.
  * @param workloadId Bulk Workload Id.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BulkJobData(
  resultUrl: Option[String],
  status: BulkRequestStatus,
  workloadId: Option[Int]
)

object BulkJobData {
  implicit lazy val bulkJobDataJsonFormat: Format[BulkJobData] = Json.format[BulkJobData]
}

