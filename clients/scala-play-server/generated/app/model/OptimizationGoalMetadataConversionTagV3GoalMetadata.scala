package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.
  * @param isRoasOptimized ROAS optimization is not supported
  * @param learningModeType Conversion learning model type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OptimizationGoalMetadataConversionTagV3GoalMetadata(
  attributionWindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows],
  conversionEvent: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEvent.Value],
  conversionTagId: Option[String],
  cpaGoalValueInMicroCurrency: Option[String],
  isRoasOptimized: Option[Boolean],
  learningModeType: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeType.Value]
)

object OptimizationGoalMetadataConversionTagV3GoalMetadata {
  implicit lazy val optimizationGoalMetadataConversionTagV3GoalMetadataJsonFormat: Format[OptimizationGoalMetadataConversionTagV3GoalMetadata] = Json.format[OptimizationGoalMetadataConversionTagV3GoalMetadata]

  // noinspection TypeAnnotation
  object ConversionEvent extends Enumeration {
    val PAGEVISIT = Value("PAGE_VISIT")
    val SIGNUP = Value("SIGNUP")
    val CHECKOUT = Value("CHECKOUT")
    val CUSTOM = Value("CUSTOM")
    val VIEWCATEGORY = Value("VIEW_CATEGORY")
    val SEARCH = Value("SEARCH")
    val ADDTOCART = Value("ADD_TO_CART")
    val WATCHVIDEO = Value("WATCH_VIDEO")
    val LEAD = Value("LEAD")
    val APPINSTALL = Value("APP_INSTALL")

    type ConversionEvent = Value
    implicit lazy val ConversionEventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object LearningModeType extends Enumeration {
    val NOTACTIVE = Value("NOT_ACTIVE")
    val ACTIVE = Value("ACTIVE")

    type LearningModeType = Value
    implicit lazy val LearningModeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

