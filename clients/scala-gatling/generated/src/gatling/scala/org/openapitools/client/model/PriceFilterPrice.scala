
package org.openapitools.client.model


case class PriceFilterPrice (
    _currency: NonNullableCatalogsCurrency,
    _negated: Option[Boolean],
    _operator: NumericFilterOperatorType,
    _value: Number
)
object PriceFilterPrice {
    def toStringBody(var_currency: Object, var_negated: Object, var_operator: Object, var_value: Object) =
        s"""
        | {
        | "currency":$var_currency,"negated":$var_negated,"operator":$var_operator,"value":$var_value
        | }
        """.stripMargin
}
