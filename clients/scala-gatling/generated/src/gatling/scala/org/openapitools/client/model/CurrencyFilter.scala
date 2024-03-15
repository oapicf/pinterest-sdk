
package org.openapitools.client.model


case class CurrencyFilter (
    _CURRENCY: CatalogsProductGroupCurrencyCriteria
)
object CurrencyFilter {
    def toStringBody(var_CURRENCY: Object) =
        s"""
        | {
        | "CURRENCY":$var_CURRENCY
        | }
        """.stripMargin
}
