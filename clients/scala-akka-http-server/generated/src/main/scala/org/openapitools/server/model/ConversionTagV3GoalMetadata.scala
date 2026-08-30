package org.openapitools.server.model


/**
 * @param attributionWindows  for example: ''null''
 * @param conversionEvent  for example: ''null''
 * @param conversionTagId  for example: ''null''
 * @param cpaGoalValueInMicroCurrency  for example: ''null''
 * @param isRoasOptimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). for example: ''null''
 * @param reportingEvent Event name for custom or standard events mapped to an oCPM model for example: ''null''
*/
final case class ConversionTagV3GoalMetadata (
  attributionWindows: Option[AttributionWindows] = None,
  conversionEvent: Option[ConversionEvent] = None,
  conversionTagId: Option[String] = None,
  cpaGoalValueInMicroCurrency: Option[String] = None,
  isRoasOptimized: Option[Boolean] = None,
  reportingEvent: Option[String] = None
)

