
package org.openapitools.client.model


case class CatalogsReportDistributionStats (
    /* ID of the catalog entity. */
    _catalogId: Option[String],
    /* The event code that a diagnostics aggregated number references */
    _code: Option[Integer],
    /* A human-friendly label for the event code (e.g, 'SPAM') */
    _codeLabel: Option[String],
    /* Indicates if issue makes items ineligible for ads distribution */
    _ineligibleForAds: Option[Boolean],
    /* Indicates if issue makes items ineligible for organic distribution */
    _ineligibleForOrganic: Option[Boolean],
    /* Title message describing the diagnostic issue */
    _message: Option[String],
    /* Number of occurrences of the issue */
    _occurrences: Option[Integer],
    _reportType: Option[String]
)
object CatalogsReportDistributionStats {
    def toStringBody(var_catalogId: Object, var_code: Object, var_codeLabel: Object, var_ineligibleForAds: Object, var_ineligibleForOrganic: Object, var_message: Object, var_occurrences: Object, var_reportType: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"code":$var_code,"codeLabel":$var_codeLabel,"ineligibleForAds":$var_ineligibleForAds,"ineligibleForOrganic":$var_ineligibleForOrganic,"message":$var_message,"occurrences":$var_occurrences,"reportType":$var_reportType
        | }
        """.stripMargin
}
