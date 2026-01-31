package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows(
  clickWindowDays: Option[Int],
  engagementWindowDays: Option[Int],
  viewWindowDays: Option[Int]
)

object OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
  implicit lazy val optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsJsonFormat: Format[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] = Json.format[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows]
}

