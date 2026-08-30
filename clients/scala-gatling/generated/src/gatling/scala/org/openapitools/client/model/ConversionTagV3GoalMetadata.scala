
package org.openapitools.client.model


case class ConversionTagV3GoalMetadata (
    _attributionWindows: Option[AttributionWindows],
    _conversionEvent: Option[ConversionEvent],
    _conversionTagId: Option[String],
    _cpaGoalValueInMicroCurrency: Option[String],
    /* Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). */
    _isRoasOptimized: Option[Boolean],
    /* Event name for custom or standard events mapped to an oCPM model */
    _reportingEvent: Option[String]
)
object ConversionTagV3GoalMetadata {
    def toStringBody(var_attributionWindows: Object, var_conversionEvent: Object, var_conversionTagId: Object, var_cpaGoalValueInMicroCurrency: Object, var_isRoasOptimized: Object, var_reportingEvent: Object) =
        s"""
        | {
        | "attributionWindows":$var_attributionWindows,"conversionEvent":$var_conversionEvent,"conversionTagId":$var_conversionTagId,"cpaGoalValueInMicroCurrency":$var_cpaGoalValueInMicroCurrency,"isRoasOptimized":$var_isRoasOptimized,"reportingEvent":$var_reportingEvent
        | }
        """.stripMargin
}
