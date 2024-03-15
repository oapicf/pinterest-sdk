package model

import play.api.libs.json._

/**
  * Possible status for a bulk reporting job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BulkReportingJobStatus(
)

object BulkReportingJobStatus {
  implicit lazy val bulkReportingJobStatusJsonFormat: Format[BulkReportingJobStatus] = Json.format[BulkReportingJobStatus]
}

