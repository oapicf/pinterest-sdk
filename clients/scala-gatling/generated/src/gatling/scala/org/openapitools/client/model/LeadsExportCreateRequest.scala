
package org.openapitools.client.model


case class LeadsExportCreateRequest (
    /* Export leads collected on and after start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* Export leads collected on and before end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* ID for the ad collecting leads */
    _adId: String
)
object LeadsExportCreateRequest {
    def toStringBody(var_startDate: Object, var_endDate: Object, var_adId: Object) =
        s"""
        | {
        | "startDate":$var_startDate,"endDate":$var_endDate,"adId":$var_adId
        | }
        """.stripMargin
}
