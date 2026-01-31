package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OptimizationGoalMetadata(
  conversionTagV3GoalMetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata],
  frequencyGoalMetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata],
  scrollupGoalMetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata]
)

object OptimizationGoalMetadata {
  implicit lazy val optimizationGoalMetadataJsonFormat: Format[OptimizationGoalMetadata] = Json.format[OptimizationGoalMetadata]
}

