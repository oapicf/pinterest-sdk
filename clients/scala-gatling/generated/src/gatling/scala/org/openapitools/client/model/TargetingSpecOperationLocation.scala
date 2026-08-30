
package org.openapitools.client.model


case class TargetingSpecOperationLocation (
    _field: String,
    _operation: TargetingSpecListOperation,
    _values: List[String]
)
object TargetingSpecOperationLocation {
    def toStringBody(var_field: Object, var_operation: Object, var_values: Object) =
        s"""
        | {
        | "field":$var_field,"operation":$var_operation,"values":$var_values
        | }
        """.stripMargin
}
