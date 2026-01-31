
package org.openapitools.client.model


case class CatalogsReport (
    _reportStatus: Option[String],
    /* Size of the report in bytes */
    _size: Option[Number],
    /* URL to download the report */
    _url: Option[String]
)
object CatalogsReport {
    def toStringBody(var_reportStatus: Object, var_size: Object, var_url: Object) =
        s"""
        | {
        | "reportStatus":$var_reportStatus,"size":$var_size,"url":$var_url
        | }
        """.stripMargin
}
