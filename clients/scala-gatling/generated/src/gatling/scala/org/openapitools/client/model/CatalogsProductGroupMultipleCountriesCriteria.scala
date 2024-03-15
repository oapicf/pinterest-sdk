
package org.openapitools.client.model


case class CatalogsProductGroupMultipleCountriesCriteria (
    _values: List[Country],
    _negated: Option[Boolean]
)
object CatalogsProductGroupMultipleCountriesCriteria {
    def toStringBody(var_values: Object, var_negated: Object) =
        s"""
        | {
        | "values":$var_values,"negated":$var_negated
        | }
        """.stripMargin
}
