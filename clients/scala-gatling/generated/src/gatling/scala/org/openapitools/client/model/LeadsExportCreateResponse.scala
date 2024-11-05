
package org.openapitools.client.model


case class LeadsExportCreateResponse (
    /* ID for the leads export job */
    _leadsExportId: Option[String]
)
object LeadsExportCreateResponse {
    def toStringBody(var_leadsExportId: Object) =
        s"""
        | {
        | "leadsExportId":$var_leadsExportId
        | }
        """.stripMargin
}
