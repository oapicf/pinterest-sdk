
package org.openapitools.client.model


case class OptimizationGoalMetadataConversionTagV3GoalMetadata (
    _attributionWindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows],
    _conversionEvent: Option[String],
    _conversionTagId: Option[String],
    _cpaGoalValueInMicroCurrency: Option[String],
    /* Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>. */
    _isRoasOptimized: Option[Boolean],
    /* Conversion learning model type */
    _learningModeType: Option[String],
    /* Event name for custom or standard events mapped to an oCPM model */
    _reportingEvent: Option[String]
)
object OptimizationGoalMetadataConversionTagV3GoalMetadata {
    def toStringBody(var_attributionWindows: Object, var_conversionEvent: Object, var_conversionTagId: Object, var_cpaGoalValueInMicroCurrency: Object, var_isRoasOptimized: Object, var_learningModeType: Object, var_reportingEvent: Object) =
        s"""
        | {
        | "attributionWindows":$var_attributionWindows,"conversionEvent":$var_conversionEvent,"conversionTagId":$var_conversionTagId,"cpaGoalValueInMicroCurrency":$var_cpaGoalValueInMicroCurrency,"isRoasOptimized":$var_isRoasOptimized,"learningModeType":$var_learningModeType,"reportingEvent":$var_reportingEvent
        | }
        """.stripMargin
}
