
package org.openapitools.client.model


case class BookClosedResponse (
    /* Are conversion metrics ready? */
    _conversionMetricsReady: Option[Boolean],
    /* Are non-conversion metrics ready? */
    _nonConversionMetricsReady: Option[Boolean]
)
object BookClosedResponse {
    def toStringBody(var_conversionMetricsReady: Object, var_nonConversionMetricsReady: Object) =
        s"""
        | {
        | "conversionMetricsReady":$var_conversionMetricsReady,"nonConversionMetricsReady":$var_nonConversionMetricsReady
        | }
        """.stripMargin
}
