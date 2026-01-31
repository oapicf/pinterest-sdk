package model

import play.api.libs.json._

/**
  * Record processing counts
  * @param invalid Number of invalid records processed
  * @param processed Number of records processed
  * @param valid Number of valid records processed
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RecordCounts(
  invalid: Int,
  processed: Int,
  valid: Int
)

object RecordCounts {
  implicit lazy val recordCountsJsonFormat: Format[RecordCounts] = Json.format[RecordCounts]
}

