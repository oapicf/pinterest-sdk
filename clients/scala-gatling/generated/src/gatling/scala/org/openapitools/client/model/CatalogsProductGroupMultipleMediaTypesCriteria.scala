
package org.openapitools.client.model


case class CatalogsProductGroupMultipleMediaTypesCriteria (
    _negated: Option[Boolean],
    _values: List[MediaType]
)
object CatalogsProductGroupMultipleMediaTypesCriteria {
    def toStringBody(var_negated: Object, var_values: Object) =
        s"""
        | {
        | "negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
