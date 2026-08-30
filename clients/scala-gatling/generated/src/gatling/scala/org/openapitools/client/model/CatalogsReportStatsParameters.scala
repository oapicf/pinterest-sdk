
package org.openapitools.client.model


case class CatalogsReportStatsParameters (
    _catalogType: String,
    _report: CatalogsHotelReportStatsParametersReport
)
object CatalogsReportStatsParameters {
    def toStringBody(var_catalogType: Object, var_report: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"report":$var_report
        | }
        """.stripMargin
}
