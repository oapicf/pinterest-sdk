
package org.openapitools.client.model


case class ConversionProductReport (
    /* Message returned from the create report request */
    _message: Option[String],
    /* Async report status */
    _reportStatus: Option[BulkReportingJobStatus],
    /* Size of the report in bytes */
    _size: Option[Number],
    /* Token returned from the create report request */
    _token: Option[String],
    /* URL of the report */
    _url: Option[String]
)
object ConversionProductReport {
    def toStringBody(var_message: Object, var_reportStatus: Object, var_size: Object, var_token: Object, var_url: Object) =
        s"""
        | {
        | "message":$var_message,"reportStatus":$var_reportStatus,"size":$var_size,"token":$var_token,"url":$var_url
        | }
        """.stripMargin
}
