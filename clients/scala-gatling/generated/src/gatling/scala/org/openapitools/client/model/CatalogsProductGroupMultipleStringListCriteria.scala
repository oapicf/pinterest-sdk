
package org.openapitools.client.model


case class CatalogsProductGroupMultipleStringListCriteria (
    _values: List[List[String]],
    _negated: Option[Boolean]
)
object CatalogsProductGroupMultipleStringListCriteria {
    def toStringBody(var_values: Object, var_negated: Object) =
        s"""
        | {
        | "values":$var_values,"negated":$var_negated
        | }
        """.stripMargin
}
