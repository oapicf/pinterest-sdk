
package org.openapitools.client.model


case class PriceFilter (
    _PRICE: CatalogsProductGroupPricingCurrencyCriteria
)
object PriceFilter {
    def toStringBody(var_PRICE: Object) =
        s"""
        | {
        | "PRICE":$var_PRICE
        | }
        """.stripMargin
}
