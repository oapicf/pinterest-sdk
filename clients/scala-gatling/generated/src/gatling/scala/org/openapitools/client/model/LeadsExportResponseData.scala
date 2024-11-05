
package org.openapitools.client.model


case class LeadsExportResponseData (
    _exportStatus: Option[LeadsExportStatus],
    _downloadUrl: Option[String]
)
object LeadsExportResponseData {
    def toStringBody(var_exportStatus: Object, var_downloadUrl: Object) =
        s"""
        | {
        | "exportStatus":$var_exportStatus,"downloadUrl":$var_downloadUrl
        | }
        """.stripMargin
}
