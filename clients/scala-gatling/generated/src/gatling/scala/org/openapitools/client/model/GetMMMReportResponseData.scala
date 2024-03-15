
package org.openapitools.client.model


case class GetMMMReportResponseData (
    _reportStatus: Option[String],
    _url: Option[String],
    _size: Option[Number]
)
object GetMMMReportResponseData {
    def toStringBody(var_reportStatus: Object, var_url: Object, var_size: Object) =
        s"""
        | {
        | "reportStatus":$var_reportStatus,"url":$var_url,"size":$var_size
        | }
        """.stripMargin
}
