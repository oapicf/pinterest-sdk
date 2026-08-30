
package org.openapitools.client.model


case class TemplateBasedReportCreate (
    _message: Option[String],
    _reportStatus: BulkReportingJobStatus,
    _token: Option[String]
)
object TemplateBasedReportCreate {
    def toStringBody(var_message: Object, var_reportStatus: Object, var_token: Object) =
        s"""
        | {
        | "message":$var_message,"reportStatus":$var_reportStatus,"token":$var_token
        | }
        """.stripMargin
}
