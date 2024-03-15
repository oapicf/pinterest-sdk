
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncResponse (
    _reportStatus: Option[BulkReportingJobStatus],
    _token: Option[String],
    _message: Option[String]
)
object AdsAnalyticsCreateAsyncResponse {
    def toStringBody(var_reportStatus: Object, var_token: Object, var_message: Object) =
        s"""
        | {
        | "reportStatus":$var_reportStatus,"token":$var_token,"message":$var_message
        | }
        """.stripMargin
}
