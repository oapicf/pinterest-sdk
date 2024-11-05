package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows(
  clickWindowDays: Option[Int],
  engagementWindowDays: Option[Int],
  viewWindowDays: Option[Int]
)

object OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
  implicit lazy val optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsJsonFormat: Format[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] = Json.format[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows]
}

