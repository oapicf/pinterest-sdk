
package org.openapitools.client.model


case class IntegrationLogsInvalidLogResponseRejectedLogsItems (
    /* The field name containing an invalid value. */
    _field: String,
    /* Index of the log in the batch. */
    _logIndex: Option[Integer],
    /* The reason the value is invalid. */
    _reason: String,
    /* The value that is invalid. */
    _value: String
)
object IntegrationLogsInvalidLogResponseRejectedLogsItems {
    def toStringBody(var_field: Object, var_logIndex: Object, var_reason: Object, var_value: Object) =
        s"""
        | {
        | "field":$var_field,"logIndex":$var_logIndex,"reason":$var_reason,"value":$var_value
        | }
        """.stripMargin
}
