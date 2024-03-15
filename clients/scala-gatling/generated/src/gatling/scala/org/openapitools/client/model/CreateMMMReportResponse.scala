
package org.openapitools.client.model


case class CreateMMMReportResponse (
    _code: Option[Number],
    _data: Option[CreateMMMReportResponseData]
)
object CreateMMMReportResponse {
    def toStringBody(var_code: Object, var_data: Object) =
        s"""
        | {
        | "code":$var_code,"data":$var_data
        | }
        """.stripMargin
}
