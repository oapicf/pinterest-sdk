
package org.openapitools.client.model


case class ReportsStatsParametersParameter (
    _catalogType: CatalogsType,
    _report: CatalogsHotelReportStatsParametersReport
)
object ReportsStatsParametersParameter {
    def toStringBody(var_catalogType: Object, var_report: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"report":$var_report
        | }
        """.stripMargin
}
