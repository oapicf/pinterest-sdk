
package org.openapitools.client.model


case class CatalogsRetailReportParameters (
    _catalogType: String,
    _report: CatalogsHotelReportParametersReport
)
object CatalogsRetailReportParameters {
    def toStringBody(var_catalogType: Object, var_report: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"report":$var_report
        | }
        """.stripMargin
}
