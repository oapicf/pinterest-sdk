package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NullableOptimizationGoalMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NullableOptimizationGoalMetadata(
  conversionTagV3GoalMetadata: Option[ConversionTagV3GoalMetadata],
  frequencyGoalMetadata: Option[FrequencyGoalMetadata],
  scrollupGoalMetadata: Option[ScrollupGoalMetadata]
)

object NullableOptimizationGoalMetadata {
  implicit lazy val nullableOptimizationGoalMetadataJsonFormat: Format[NullableOptimizationGoalMetadata] = Json.format[NullableOptimizationGoalMetadata]
}

