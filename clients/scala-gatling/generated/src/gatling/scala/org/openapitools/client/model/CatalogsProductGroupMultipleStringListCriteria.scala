
package org.openapitools.client.model


case class CatalogsProductGroupMultipleStringListCriteria (
    _negated: Option[Boolean],
    _values: List[List[String]]
)
object CatalogsProductGroupMultipleStringListCriteria {
    def toStringBody(var_negated: Object, var_values: Object) =
        s"""
        | {
        | "negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
