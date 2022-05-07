
package org.openapitools.client.model


case class MinPriceFilter (
    _MIN_PRICE: CatalogsProductGroupPricingCriteria
)
object MinPriceFilter {
    def toStringBody(var_MIN_PRICE: Object) =
        s"""
        | {
        | "MIN_PRICE":$var_MIN_PRICE
        | }
        """.stripMargin
}
