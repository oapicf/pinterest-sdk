
package org.openapitools.client.model


case class CatalogsReport (
    _reportStatus: Option[String],
    /* URL to download the report */
    _url: Option[String],
    /* Size of the report in bytes */
    _size: Option[Number]
)
object CatalogsReport {
    def toStringBody(var_reportStatus: Object, var_url: Object, var_size: Object) =
        s"""
        | {
        | "reportStatus":$var_reportStatus,"url":$var_url,"size":$var_size
        | }
        """.stripMargin
}
