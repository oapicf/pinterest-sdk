package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTagV3GoalMetadata.
  * @param isRoasOptimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
  * @param reportingEvent Event name for custom or standard events mapped to an oCPM model
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionTagV3GoalMetadata(
  attributionWindows: Option[AttributionWindows],
  conversionEvent: Option[ConversionEvent],
  conversionTagId: Option[String],
  cpaGoalValueInMicroCurrency: Option[String],
  isRoasOptimized: Option[Boolean],
  reportingEvent: Option[String]
)

object ConversionTagV3GoalMetadata {
  implicit lazy val conversionTagV3GoalMetadataJsonFormat: Format[ConversionTagV3GoalMetadata] = Json.format[ConversionTagV3GoalMetadata]
}

