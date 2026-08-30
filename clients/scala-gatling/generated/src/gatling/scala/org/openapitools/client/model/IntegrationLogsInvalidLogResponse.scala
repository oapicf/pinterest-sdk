
package org.openapitools.client.model


case class IntegrationLogsInvalidLogResponse (
    _rejectedLogs: Option[List[IntegrationLogsInvalidLogResponseRejectedLogsItems]]
)
object IntegrationLogsInvalidLogResponse {
    def toStringBody(var_rejectedLogs: Object) =
        s"""
        | {
        | "rejectedLogs":$var_rejectedLogs
        | }
        """.stripMargin
}
