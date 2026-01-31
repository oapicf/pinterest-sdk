
package org.openapitools.client.model


case class LeadsExportResponseData (
    _downloadUrl: Option[String],
    _exportStatus: Option[LeadsExportStatus]
)
object LeadsExportResponseData {
    def toStringBody(var_downloadUrl: Object, var_exportStatus: Object) =
        s"""
        | {
        | "downloadUrl":$var_downloadUrl,"exportStatus":$var_exportStatus
        | }
        """.stripMargin
}
