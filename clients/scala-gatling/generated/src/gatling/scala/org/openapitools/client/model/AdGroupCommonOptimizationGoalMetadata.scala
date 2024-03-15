
package org.openapitools.client.model


case class AdGroupCommonOptimizationGoalMetadata (
    _conversionTagV3GoalMetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata],
    _frequencyGoalMetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata],
    _scrollupGoalMetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata]
)
object AdGroupCommonOptimizationGoalMetadata {
    def toStringBody(var_conversionTagV3GoalMetadata: Object, var_frequencyGoalMetadata: Object, var_scrollupGoalMetadata: Object) =
        s"""
        | {
        | "conversionTagV3GoalMetadata":$var_conversionTagV3GoalMetadata,"frequencyGoalMetadata":$var_frequencyGoalMetadata,"scrollupGoalMetadata":$var_scrollupGoalMetadata
        | }
        """.stripMargin
}
