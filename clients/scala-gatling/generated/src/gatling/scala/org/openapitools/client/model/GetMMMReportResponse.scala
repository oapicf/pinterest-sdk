
package org.openapitools.client.model


case class GetMMMReportResponse (
    _code: Option[Number],
    _data: Option[GetMMMReportResponseData],
    _message: Option[String],
    _status: Option[String]
)
object GetMMMReportResponse {
    def toStringBody(var_code: Object, var_data: Object, var_message: Object, var_status: Object) =
        s"""
        | {
        | "code":$var_code,"data":$var_data,"message":$var_message,"status":$var_status
        | }
        """.stripMargin
}
