package model

import play.api.libs.json._

/**
  * Possible status for a bulk reporting job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkReportingJobStatus(
)

object BulkReportingJobStatus {
  implicit lazy val bulkReportingJobStatusJsonFormat: Format[BulkReportingJobStatus] = Json.format[BulkReportingJobStatus]
}

