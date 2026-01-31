
package org.openapitools.client.model


case class CatalogsProductGroupMultipleCountriesCriteria (
    _negated: Option[Boolean],
    _values: List[Country]
)
object CatalogsProductGroupMultipleCountriesCriteria {
    def toStringBody(var_negated: Object, var_values: Object) =
        s"""
        | {
        | "negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
