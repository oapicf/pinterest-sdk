package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OptimizationGoalMetadata(
  conversionTagV3GoalMetadata: Option[ConversionTagV3GoalMetadata],
  frequencyGoalMetadata: Option[FrequencyGoalMetadata],
  scrollupGoalMetadata: Option[ScrollupGoalMetadata]
)

object OptimizationGoalMetadata {
  implicit lazy val optimizationGoalMetadataJsonFormat: Format[OptimizationGoalMetadata] = Json.format[OptimizationGoalMetadata]
}

