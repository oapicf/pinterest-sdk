
package org.openapitools.client.model


case class CreateMMMReportResponseData (
    _message: Option[String],
    _reportStatus: Option[BulkReportingJobStatus],
    _status: Option[String],
    _token: Option[String]
)
object CreateMMMReportResponseData {
    def toStringBody(var_message: Object, var_reportStatus: Object, var_status: Object, var_token: Object) =
        s"""
        | {
        | "message":$var_message,"reportStatus":$var_reportStatus,"status":$var_status,"token":$var_token
        | }
        """.stripMargin
}
