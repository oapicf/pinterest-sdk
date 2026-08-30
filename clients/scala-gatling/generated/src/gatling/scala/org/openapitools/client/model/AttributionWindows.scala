
package org.openapitools.client.model


case class AttributionWindows (
    _clickWindowDays: Option[Integer],
    _engagementWindowDays: Option[Integer],
    _viewWindowDays: Option[Integer]
)
object AttributionWindows {
    def toStringBody(var_clickWindowDays: Object, var_engagementWindowDays: Object, var_viewWindowDays: Object) =
        s"""
        | {
        | "clickWindowDays":$var_clickWindowDays,"engagementWindowDays":$var_engagementWindowDays,"viewWindowDays":$var_viewWindowDays
        | }
        """.stripMargin
}
