package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RecordCounts.
  * @param invalid Number of invalid records processed
  * @param processed Number of records processed
  * @param valid Number of valid records processed
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RecordCounts(
  invalid: Int,
  processed: Int,
  valid: Int
)

object RecordCounts {
  implicit lazy val recordCountsJsonFormat: Format[RecordCounts] = Json.format[RecordCounts]
}

