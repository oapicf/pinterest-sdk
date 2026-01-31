package org.openapitools.server.model


/**
 * @param attributionWindows  for example: ''null''
 * @param conversionEvent  for example: ''null''
 * @param conversionTagId  for example: ''null''
 * @param cpaGoalValueInMicroCurrency  for example: ''null''
 * @param isRoasOptimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>. for example: ''null''
 * @param learningModeType Conversion learning model type for example: ''ACTIVE''
 * @param reportingEvent Event name for custom or standard events mapped to an oCPM model for example: ''INITIATE_CHECKOUT''
*/
final case class OptimizationGoalMetadataConversionTagV3GoalMetadata (
  attributionWindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] = None,
  conversionEvent: Option[String] = None,
  conversionTagId: Option[String] = None,
  cpaGoalValueInMicroCurrency: Option[String] = None,
  isRoasOptimized: Option[Boolean] = None,
  learningModeType: Option[String] = None,
  reportingEvent: Option[String] = None
)

