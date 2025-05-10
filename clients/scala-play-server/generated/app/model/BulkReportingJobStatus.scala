package model

import play.api.libs.json._

/**
  * Possible status for a bulk reporting job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BulkReportingJobStatus(
)

object BulkReportingJobStatus {
  implicit lazy val bulkReportingJobStatusJsonFormat: Format[BulkReportingJobStatus] = Json.format[BulkReportingJobStatus]
}

