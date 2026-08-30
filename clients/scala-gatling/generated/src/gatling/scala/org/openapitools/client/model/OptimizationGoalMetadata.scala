
package org.openapitools.client.model


case class OptimizationGoalMetadata (
    _conversionTagV3GoalMetadata: Option[ConversionTagV3GoalMetadata],
    _frequencyGoalMetadata: Option[FrequencyGoalMetadata],
    _scrollupGoalMetadata: Option[ScrollupGoalMetadata]
)
object OptimizationGoalMetadata {
    def toStringBody(var_conversionTagV3GoalMetadata: Object, var_frequencyGoalMetadata: Object, var_scrollupGoalMetadata: Object) =
        s"""
        | {
        | "conversionTagV3GoalMetadata":$var_conversionTagV3GoalMetadata,"frequencyGoalMetadata":$var_frequencyGoalMetadata,"scrollupGoalMetadata":$var_scrollupGoalMetadata
        | }
        """.stripMargin
}
