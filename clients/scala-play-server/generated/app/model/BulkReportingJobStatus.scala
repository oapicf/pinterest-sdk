package model

import play.api.libs.json._

/**
  * Possible status for a bulk reporting job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BulkReportingJobStatus(
)

object BulkReportingJobStatus {
  implicit lazy val bulkReportingJobStatusJsonFormat: Format[BulkReportingJobStatus] = Json.format[BulkReportingJobStatus]
}

