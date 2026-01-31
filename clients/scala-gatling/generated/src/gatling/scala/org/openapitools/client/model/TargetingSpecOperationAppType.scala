
package org.openapitools.client.model


case class TargetingSpecOperationAppType (
    _field: String,
    _operation: String,
    _values: List[TargetingSpecAppType]
)
object TargetingSpecOperationAppType {
    def toStringBody(var_field: Object, var_operation: Object, var_values: Object) =
        s"""
        | {
        | "field":$var_field,"operation":$var_operation,"values":$var_values
        | }
        """.stripMargin
}
