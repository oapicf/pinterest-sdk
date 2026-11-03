package model

import play.api.libs.json._

/**
  * Frequency target can only be between 2 and 20
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FrequencyGoalMetadata(
  frequency: Option[Int],
  timerange: Option[FrequencyGoalMetadataTimerange]
)

object FrequencyGoalMetadata {
  implicit lazy val frequencyGoalMetadataJsonFormat: Format[FrequencyGoalMetadata] = Json.format[FrequencyGoalMetadata]
}

