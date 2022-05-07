
package org.openapitools.client.model


case class CatalogsProductGroupMultipleStringCriteria (
    _values: List[String],
    _negated: Boolean
)
object CatalogsProductGroupMultipleStringCriteria {
    def toStringBody(var_values: Object, var_negated: Object) =
        s"""
        | {
        | "values":$var_values,"negated":$var_negated
        | }
        """.stripMargin
}
