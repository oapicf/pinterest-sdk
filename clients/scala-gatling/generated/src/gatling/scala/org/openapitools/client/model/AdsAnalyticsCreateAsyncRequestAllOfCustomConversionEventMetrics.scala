
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics (
    /* Metrics for custom defined conversion event. */
    _customEventMetricsType: String,
    /* Name of the advertiser-defined custom conversion event */
    _customEventName: String
)
object AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics {
    def toStringBody(var_customEventMetricsType: Object, var_customEventName: Object) =
        s"""
        | {
        | "customEventMetricsType":$var_customEventMetricsType,"customEventName":$var_customEventName
        | }
        """.stripMargin
}
