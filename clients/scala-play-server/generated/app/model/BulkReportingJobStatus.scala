package model

import play.api.libs.json._

/**
  * Possible status for a bulk reporting job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BulkReportingJobStatus(
)

object BulkReportingJobStatus {
  implicit lazy val bulkReportingJobStatusJsonFormat: Format[BulkReportingJobStatus] = Json.format[BulkReportingJobStatus]
}

