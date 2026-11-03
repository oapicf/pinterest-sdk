package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OptimizationGoalMetadata(
  conversionTagV3GoalMetadata: Option[ConversionTagV3GoalMetadata],
  frequencyGoalMetadata: Option[FrequencyGoalMetadata],
  scrollupGoalMetadata: Option[ScrollupGoalMetadata]
)

object OptimizationGoalMetadata {
  implicit lazy val optimizationGoalMetadataJsonFormat: Format[OptimizationGoalMetadata] = Json.format[OptimizationGoalMetadata]
}

