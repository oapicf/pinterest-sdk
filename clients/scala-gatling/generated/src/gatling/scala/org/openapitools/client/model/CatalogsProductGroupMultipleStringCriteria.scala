
package org.openapitools.client.model


case class CatalogsProductGroupMultipleStringCriteria (
    _negated: Option[Boolean],
    _values: List[String]
)
object CatalogsProductGroupMultipleStringCriteria {
    def toStringBody(var_negated: Object, var_values: Object) =
        s"""
        | {
        | "negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
