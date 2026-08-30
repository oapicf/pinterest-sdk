
package org.openapitools.client.model


case class MMMReport (
    _message: Option[String],
    _reportStatus: Option[BulkReportingJobStatus],
    _size: Option[Number],
    _status: Option[String],
    _token: Option[String],
    _url: Option[String]
)
object MMMReport {
    def toStringBody(var_message: Object, var_reportStatus: Object, var_size: Object, var_status: Object, var_token: Object, var_url: Object) =
        s"""
        | {
        | "message":$var_message,"reportStatus":$var_reportStatus,"size":$var_size,"status":$var_status,"token":$var_token,"url":$var_url
        | }
        """.stripMargin
}
