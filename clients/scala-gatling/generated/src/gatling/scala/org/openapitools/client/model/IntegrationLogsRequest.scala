
package org.openapitools.client.model


case class IntegrationLogsRequest (
    _logs: List[IntegrationLog]
)
object IntegrationLogsRequest {
    def toStringBody(var_logs: Object) =
        s"""
        | {
        | "logs":$var_logs
        | }
        """.stripMargin
}
