
package org.openapitools.client.model


case class CatalogsReportDistributionIssueFilter (
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    _catalogId: Option[String],
    _reportType: String
)
object CatalogsReportDistributionIssueFilter {
    def toStringBody(var_catalogId: Object, var_reportType: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"reportType":$var_reportType
        | }
        """.stripMargin
}
