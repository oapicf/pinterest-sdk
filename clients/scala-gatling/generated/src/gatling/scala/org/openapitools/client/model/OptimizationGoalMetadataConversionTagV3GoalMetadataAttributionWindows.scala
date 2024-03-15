
package org.openapitools.client.model


case class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows (
    _clickWindowDays: Option[Integer],
    _engagementWindowDays: Option[Integer],
    _viewWindowDays: Option[Integer]
)
object OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
    def toStringBody(var_clickWindowDays: Object, var_engagementWindowDays: Object, var_viewWindowDays: Object) =
        s"""
        | {
        | "clickWindowDays":$var_clickWindowDays,"engagementWindowDays":$var_engagementWindowDays,"viewWindowDays":$var_viewWindowDays
        | }
        """.stripMargin
}
