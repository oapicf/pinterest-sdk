
package org.openapitools.client.model


case class InnerProductCategoriesMetricsHighlights (
    /* Month-over-month percentage change */
    _pctChangeMom: Number
)
object InnerProductCategoriesMetricsHighlights {
    def toStringBody(var_pctChangeMom: Object) =
        s"""
        | {
        | "pctChangeMom":$var_pctChangeMom
        | }
        """.stripMargin
}
