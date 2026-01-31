
package org.openapitools.client.model


case class TemplateBasedReport (
    _message: Option[String],
    _reportStatus: BulkReportingJobStatus,
    /* Unique identifier of a template. */
    _templateId: String,
    _token: Option[String]
)
object TemplateBasedReport {
    def toStringBody(var_message: Object, var_reportStatus: Object, var_templateId: Object, var_token: Object) =
        s"""
        | {
        | "message":$var_message,"reportStatus":$var_reportStatus,"templateId":$var_templateId,"token":$var_token
        | }
        """.stripMargin
}
