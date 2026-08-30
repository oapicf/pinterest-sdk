
package org.openapitools.client.model


case class LeadsExports (
    /* ID for the leads export job. */
    _leadsExportId: Option[String]
)
object LeadsExports {
    def toStringBody(var_leadsExportId: Object) =
        s"""
        | {
        | "leadsExportId":$var_leadsExportId
        | }
        """.stripMargin
}
