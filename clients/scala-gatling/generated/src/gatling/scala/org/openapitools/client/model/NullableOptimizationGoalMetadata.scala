
package org.openapitools.client.model


case class NullableOptimizationGoalMetadata (
    _conversionTagV3GoalMetadata: Option[ConversionTagV3GoalMetadata],
    _frequencyGoalMetadata: Option[FrequencyGoalMetadata],
    _scrollupGoalMetadata: Option[ScrollupGoalMetadata]
)
object NullableOptimizationGoalMetadata {
    def toStringBody(var_conversionTagV3GoalMetadata: Object, var_frequencyGoalMetadata: Object, var_scrollupGoalMetadata: Object) =
        s"""
        | {
        | "conversionTagV3GoalMetadata":$var_conversionTagV3GoalMetadata,"frequencyGoalMetadata":$var_frequencyGoalMetadata,"scrollupGoalMetadata":$var_scrollupGoalMetadata
        | }
        """.stripMargin
}
