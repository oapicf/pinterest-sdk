
package org.openapitools.client.model


case class CustomConversionEventMetrics (
    _customEventMetricsType: AdeColumnType,
    /* Name of the advertiser-defined custom conversion event */
    _customEventName: String
)
object CustomConversionEventMetrics {
    def toStringBody(var_customEventMetricsType: Object, var_customEventName: Object) =
        s"""
        | {
        | "customEventMetricsType":$var_customEventMetricsType,"customEventName":$var_customEventName
        | }
        """.stripMargin
}
