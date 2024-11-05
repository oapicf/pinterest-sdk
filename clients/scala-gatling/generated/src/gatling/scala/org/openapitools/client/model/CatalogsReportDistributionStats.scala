
package org.openapitools.client.model


case class CatalogsReportDistributionStats (
    _reportType: Option[String],
    /* ID of the catalog entity. */
    _catalogId: Option[String],
    /* The event code that a diagnostics aggregated number references */
    _code: Option[Integer],
    /* A human-friendly label for the event code (e.g, 'SPAM') */
    _codeLabel: Option[String],
    /* Title message describing the diagnostic issue */
    _message: Option[String],
    /* Number of occurrences of the issue */
    _occurrences: Option[Integer],
    /* Indicates if issue makes items ineligible for ads distribution */
    _ineligibleForAds: Option[Boolean],
    /* Indicates if issue makes items ineligible for organic distribution */
    _ineligibleForOrganic: Option[Boolean]
)
object CatalogsReportDistributionStats {
    def toStringBody(var_reportType: Object, var_catalogId: Object, var_code: Object, var_codeLabel: Object, var_message: Object, var_occurrences: Object, var_ineligibleForAds: Object, var_ineligibleForOrganic: Object) =
        s"""
        | {
        | "reportType":$var_reportType,"catalogId":$var_catalogId,"code":$var_code,"codeLabel":$var_codeLabel,"message":$var_message,"occurrences":$var_occurrences,"ineligibleForAds":$var_ineligibleForAds,"ineligibleForOrganic":$var_ineligibleForOrganic
        | }
        """.stripMargin
}
