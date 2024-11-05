
package org.openapitools.client.model


case class CatalogsReportParameters (
    _catalogType: CatalogsType,
    _report: CatalogsHotelReportParametersReport
)
object CatalogsReportParameters {
    def toStringBody(var_catalogType: Object, var_report: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"report":$var_report
        | }
        """.stripMargin
}
