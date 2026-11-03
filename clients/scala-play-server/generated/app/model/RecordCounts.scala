package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RecordCounts.
  * @param invalid Number of invalid records processed
  * @param processed Number of records processed
  * @param valid Number of valid records processed
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RecordCounts(
  invalid: Int,
  processed: Int,
  valid: Int
)

object RecordCounts {
  implicit lazy val recordCountsJsonFormat: Format[RecordCounts] = Json.format[RecordCounts]
}

