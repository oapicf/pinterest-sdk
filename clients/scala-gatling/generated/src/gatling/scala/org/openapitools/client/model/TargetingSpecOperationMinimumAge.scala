
package org.openapitools.client.model


case class TargetingSpecOperationMinimumAge (
    _field: String,
    _operation: String,
    _value: String
)
object TargetingSpecOperationMinimumAge {
    def toStringBody(var_field: Object, var_operation: Object, var_value: Object) =
        s"""
        | {
        | "field":$var_field,"operation":$var_operation,"value":$var_value
        | }
        """.stripMargin
}
