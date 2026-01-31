
package org.openapitools.client.model


case class CatalogsProductGroupUint32Criteria (
    _negated: Option[Boolean],
    _operator: String,
    _value: Integer
)
object CatalogsProductGroupUint32Criteria {
    def toStringBody(var_negated: Object, var_operator: Object, var_value: Object) =
        s"""
        | {
        | "negated":$var_negated,"operator":$var_operator,"value":$var_value
        | }
        """.stripMargin
}
