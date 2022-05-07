
package org.openapitools.client.model


case class MaxPriceFilter (
    _MAX_PRICE: CatalogsProductGroupPricingCriteria
)
object MaxPriceFilter {
    def toStringBody(var_MAX_PRICE: Object) =
        s"""
        | {
        | "MAX_PRICE":$var_MAX_PRICE
        | }
        """.stripMargin
}
