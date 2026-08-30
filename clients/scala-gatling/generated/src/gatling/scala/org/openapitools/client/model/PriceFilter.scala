
package org.openapitools.client.model


case class PriceFilter (
    _PRICE: PriceFilterPrice
)
object PriceFilter {
    def toStringBody(var_PRICE: Object) =
        s"""
        | {
        | "PRICE":$var_PRICE
        | }
        """.stripMargin
}
