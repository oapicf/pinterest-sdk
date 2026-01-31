
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncResponse (
    _message: Option[String],
    _reportStatus: Option[BulkReportingJobStatus],
    _token: Option[String]
)
object AdsAnalyticsCreateAsyncResponse {
    def toStringBody(var_message: Object, var_reportStatus: Object, var_token: Object) =
        s"""
        | {
        | "message":$var_message,"reportStatus":$var_reportStatus,"token":$var_token
        | }
        """.stripMargin
}
