
package org.openapitools.client.model


case class CatalogsRetailReportStatsParameters (
    _catalogType: String,
    _report: CatalogsRetailReportStatsParametersReport
)
object CatalogsRetailReportStatsParameters {
    def toStringBody(var_catalogType: Object, var_report: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"report":$var_report
        | }
        """.stripMargin
}
