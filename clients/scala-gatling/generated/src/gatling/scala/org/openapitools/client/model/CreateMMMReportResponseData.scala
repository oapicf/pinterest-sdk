
package org.openapitools.client.model


case class CreateMMMReportResponseData (
    _reportStatus: Option[BulkReportingJobStatus],
    _token: Option[String],
    _message: Option[String],
    _status: Option[String]
)
object CreateMMMReportResponseData {
    def toStringBody(var_reportStatus: Object, var_token: Object, var_message: Object, var_status: Object) =
        s"""
        | {
        | "reportStatus":$var_reportStatus,"token":$var_token,"message":$var_message,"status":$var_status
        | }
        """.stripMargin
}
