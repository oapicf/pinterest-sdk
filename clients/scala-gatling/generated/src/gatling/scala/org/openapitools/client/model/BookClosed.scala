
package org.openapitools.client.model


case class BookClosed (
    /* Are conversion metrics ready? */
    _conversionMetricsReady: Boolean,
    /* Are non-conversion metrics ready? */
    _nonConversionMetricsReady: Boolean
)
object BookClosed {
    def toStringBody(var_conversionMetricsReady: Object, var_nonConversionMetricsReady: Object) =
        s"""
        | {
        | "conversionMetricsReady":$var_conversionMetricsReady,"nonConversionMetricsReady":$var_nonConversionMetricsReady
        | }
        """.stripMargin
}
