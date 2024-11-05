
package org.openapitools.client.model


case class CatalogsReportDistributionIssueFilter (
    _reportType: String,
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    _catalogId: Option[String]
)
object CatalogsReportDistributionIssueFilter {
    def toStringBody(var_reportType: Object, var_catalogId: Object) =
        s"""
        | {
        | "reportType":$var_reportType,"catalogId":$var_catalogId
        | }
        """.stripMargin
}
