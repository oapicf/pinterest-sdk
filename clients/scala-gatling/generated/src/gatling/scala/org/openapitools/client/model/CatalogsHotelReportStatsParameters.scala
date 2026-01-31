
package org.openapitools.client.model


case class CatalogsHotelReportStatsParameters (
    _catalogType: String,
    _report: CatalogsHotelReportStatsParametersReport
)
object CatalogsHotelReportStatsParameters {
    def toStringBody(var_catalogType: Object, var_report: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"report":$var_report
        | }
        """.stripMargin
}
