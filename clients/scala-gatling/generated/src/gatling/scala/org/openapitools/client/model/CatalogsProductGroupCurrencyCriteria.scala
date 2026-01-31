
package org.openapitools.client.model


case class CatalogsProductGroupCurrencyCriteria (
    _negated: Option[Boolean],
    _values: NonNullableCatalogsCurrency
)
object CatalogsProductGroupCurrencyCriteria {
    def toStringBody(var_negated: Object, var_values: Object) =
        s"""
        | {
        | "negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
