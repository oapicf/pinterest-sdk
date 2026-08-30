
package org.openapitools.client.model


case class TargetingSpecOperations (
    _field: String,
    _operation: String,
    _values: List[TargetingSpecShoppingRetargeting],
    _value: String
)
object TargetingSpecOperations {
    def toStringBody(var_field: Object, var_operation: Object, var_values: Object, var_value: Object) =
        s"""
        | {
        | "field":$var_field,"operation":$var_operation,"values":$var_values,"value":$var_value
        | }
        """.stripMargin
}
