package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.
  * @param isRoasOptimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
  * @param learningModeType Conversion learning model type
  * @param reportingEvent Event name for custom or standard events mapped to an oCPM model
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OptimizationGoalMetadataConversionTagV3GoalMetadata(
  attributionWindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows],
  conversionEvent: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEvent.Value],
  conversionTagId: Option[String],
  cpaGoalValueInMicroCurrency: Option[String],
  isRoasOptimized: Option[Boolean],
  learningModeType: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeType.Value],
  reportingEvent: Option[String]
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

