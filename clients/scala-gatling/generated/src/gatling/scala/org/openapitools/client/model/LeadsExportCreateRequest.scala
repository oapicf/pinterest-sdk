
package org.openapitools.client.model


case class LeadsExportCreateRequest (
    /* ID for the ad collecting leads */
    _adId: String,
    /* Export leads collected on and before end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* Export leads collected on and after start date (UTC). Format: YYYY-MM-DD */
    _startDate: String
)
object LeadsExportCreateRequest {
    def toStringBody(var_adId: Object, var_endDate: Object, var_startDate: Object) =
        s"""
        | {
        | "adId":$var_adId,"endDate":$var_endDate,"startDate":$var_startDate
        | }
        """.stripMargin
}
