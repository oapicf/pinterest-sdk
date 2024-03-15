
package org.openapitools.client.model


case class IntegrationLogsSuccessResponse (
    _message: Option[String]
)
object IntegrationLogsSuccessResponse {
    def toStringBody(var_message: Object) =
        s"""
        | {
        | "message":$var_message
        | }
        """.stripMargin
}
