
package org.openapitools.client.model


case class IntegrationsLogsPost400Response (
    _code: Integer,
    _message: String,
    _details: Any
)
object IntegrationsLogsPost400Response {
    def toStringBody(var_code: Object, var_message: Object, var_details: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message,"details":$var_details
        | }
        """.stripMargin
}
