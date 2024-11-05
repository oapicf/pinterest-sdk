
package org.openapitools.client.model


case class OptimizationGoalMetadataConversionTagV3GoalMetadata (
    _attributionWindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows],
    _conversionEvent: Option[String],
    _conversionTagId: Option[String],
    _cpaGoalValueInMicroCurrency: Option[String],
    /* ROAS optimization is not supported */
    _isRoasOptimized: Option[Boolean],
    /* Conversion learning model type */
    _learningModeType: Option[String]
)
object OptimizationGoalMetadataConversionTagV3GoalMetadata {
    def toStringBody(var_attributionWindows: Object, var_conversionEvent: Object, var_conversionTagId: Object, var_cpaGoalValueInMicroCurrency: Object, var_isRoasOptimized: Object, var_learningModeType: Object) =
        s"""
        | {
        | "attributionWindows":$var_attributionWindows,"conversionEvent":$var_conversionEvent,"conversionTagId":$var_conversionTagId,"cpaGoalValueInMicroCurrency":$var_cpaGoalValueInMicroCurrency,"isRoasOptimized":$var_isRoasOptimized,"learningModeType":$var_learningModeType
        | }
        """.stripMargin
}
