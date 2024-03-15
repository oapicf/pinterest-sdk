
package org.openapitools.client.model


case class IntegrationLogsInvalidLogResponseRejectedLogsInner (
    /* Index of the log in the batch. */
    _logIndex: Option[Integer],
    /* The field name containing an invalid value. */
    _field: String,
    /* The value that is invalid. */
    _value: String,
    /* The reason the value is invalid. */
    _reason: String
)
object IntegrationLogsInvalidLogResponseRejectedLogsInner {
    def toStringBody(var_logIndex: Object, var_field: Object, var_value: Object, var_reason: Object) =
        s"""
        | {
        | "logIndex":$var_logIndex,"field":$var_field,"value":$var_value,"reason":$var_reason
        | }
        """.stripMargin
}
