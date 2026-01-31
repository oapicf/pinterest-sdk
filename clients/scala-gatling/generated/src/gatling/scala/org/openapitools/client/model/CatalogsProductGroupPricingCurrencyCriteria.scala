
package org.openapitools.client.model


case class CatalogsProductGroupPricingCurrencyCriteria (
    _currency: NonNullableCatalogsCurrency,
    _negated: Option[Boolean],
    _operator: String,
    _value: Number
)
object CatalogsProductGroupPricingCurrencyCriteria {
    def toStringBody(var_currency: Object, var_negated: Object, var_operator: Object, var_value: Object) =
        s"""
        | {
        | "currency":$var_currency,"negated":$var_negated,"operator":$var_operator,"value":$var_value
        | }
        """.stripMargin
}
