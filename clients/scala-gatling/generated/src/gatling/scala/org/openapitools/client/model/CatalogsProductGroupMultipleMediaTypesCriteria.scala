
package org.openapitools.client.model


case class CatalogsProductGroupMultipleMediaTypesCriteria (
    _values: List[MediaType],
    _negated: Option[Boolean]
)
object CatalogsProductGroupMultipleMediaTypesCriteria {
    def toStringBody(var_values: Object, var_negated: Object) =
        s"""
        | {
        | "values":$var_values,"negated":$var_negated
        | }
        """.stripMargin
}
