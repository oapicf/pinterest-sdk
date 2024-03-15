
package org.openapitools.client.model


case class CatalogsProductGroupCurrencyCriteria (
    _values: NonNullableCatalogsCurrency,
    _negated: Option[Boolean]
)
object CatalogsProductGroupCurrencyCriteria {
    def toStringBody(var_values: Object, var_negated: Object) =
        s"""
        | {
        | "values":$var_values,"negated":$var_negated
        | }
        """.stripMargin
}
