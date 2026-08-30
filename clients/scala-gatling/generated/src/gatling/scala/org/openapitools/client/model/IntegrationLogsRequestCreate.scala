
package org.openapitools.client.model


case class IntegrationLogsRequestCreate (
    _logs: List[IntegrationLog]
)
object IntegrationLogsRequestCreate {
    def toStringBody(var_logs: Object) =
        s"""
        | {
        | "logs":$var_logs
        | }
        """.stripMargin
}
