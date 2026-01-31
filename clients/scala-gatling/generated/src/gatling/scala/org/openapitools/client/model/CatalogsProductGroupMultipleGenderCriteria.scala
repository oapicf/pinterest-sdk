
package org.openapitools.client.model


case class CatalogsProductGroupMultipleGenderCriteria (
    _negated: Option[Boolean],
    _values: List[Gender]
)
object CatalogsProductGroupMultipleGenderCriteria {
    def toStringBody(var_negated: Object, var_values: Object) =
        s"""
        | {
        | "negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
