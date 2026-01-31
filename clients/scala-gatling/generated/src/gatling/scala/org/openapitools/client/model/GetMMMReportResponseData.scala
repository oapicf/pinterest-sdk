
package org.openapitools.client.model


case class GetMMMReportResponseData (
    _reportStatus: Option[String],
    _size: Option[Number],
    _url: Option[String]
)
object GetMMMReportResponseData {
    def toStringBody(var_reportStatus: Object, var_size: Object, var_url: Object) =
        s"""
        | {
        | "reportStatus":$var_reportStatus,"size":$var_size,"url":$var_url
        | }
        """.stripMargin
}
