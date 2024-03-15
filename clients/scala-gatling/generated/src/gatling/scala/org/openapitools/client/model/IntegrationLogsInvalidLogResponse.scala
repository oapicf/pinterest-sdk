
package org.openapitools.client.model


case class IntegrationLogsInvalidLogResponse (
    _rejectedLogs: Option[List[IntegrationLogsInvalidLogResponseRejectedLogsInner]]
)
object IntegrationLogsInvalidLogResponse {
    def toStringBody(var_rejectedLogs: Object) =
        s"""
        | {
        | "rejectedLogs":$var_rejectedLogs
        | }
        """.stripMargin
}
