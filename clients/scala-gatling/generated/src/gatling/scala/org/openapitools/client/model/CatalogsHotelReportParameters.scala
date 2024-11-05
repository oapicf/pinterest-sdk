
package org.openapitools.client.model


case class CatalogsHotelReportParameters (
    _catalogType: String,
    _report: CatalogsHotelReportParametersReport
)
object CatalogsHotelReportParameters {
    def toStringBody(var_catalogType: Object, var_report: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"report":$var_report
        | }
        """.stripMargin
}
