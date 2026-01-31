
package org.openapitools.client.model


case class ProductCategoriesMetricsHighlights (
    /* Engagement metric value */
    _engagement: Option[InnerProductCategoriesMetricsHighlights],
    /* Number of outbound clicks */
    _outboundClicks: Option[InnerProductCategoriesMetricsHighlights],
    /* Number of pin saves */
    _pinSaves: Option[InnerProductCategoriesMetricsHighlights]
)
object ProductCategoriesMetricsHighlights {
    def toStringBody(var_engagement: Object, var_outboundClicks: Object, var_pinSaves: Object) =
        s"""
        | {
        | "engagement":$var_engagement,"outboundClicks":$var_outboundClicks,"pinSaves":$var_pinSaves
        | }
        """.stripMargin
}
