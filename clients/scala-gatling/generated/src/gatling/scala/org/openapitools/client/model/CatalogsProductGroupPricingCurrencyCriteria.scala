
package org.openapitools.client.model


case class CatalogsProductGroupPricingCurrencyCriteria (
    _operator: String,
    _value: Number,
    _currency: NonNullableCatalogsCurrency,
    _negated: Option[Boolean]
)
object CatalogsProductGroupPricingCurrencyCriteria {
    def toStringBody(var_operator: Object, var_value: Object, var_currency: Object, var_negated: Object) =
        s"""
        | {
        | "operator":$var_operator,"value":$var_value,"currency":$var_currency,"negated":$var_negated
        | }
        """.stripMargin
}
