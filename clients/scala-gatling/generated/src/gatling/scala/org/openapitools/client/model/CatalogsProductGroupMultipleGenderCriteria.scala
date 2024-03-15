
package org.openapitools.client.model


case class CatalogsProductGroupMultipleGenderCriteria (
    _values: List[Gender],
    _negated: Option[Boolean]
)
object CatalogsProductGroupMultipleGenderCriteria {
    def toStringBody(var_values: Object, var_negated: Object) =
        s"""
        | {
        | "values":$var_values,"negated":$var_negated
        | }
        """.stripMargin
}
