
package org.openapitools.client.model


case class CatalogsReportFeedIngestionStats (
    _reportType: Option[String],
    /* ID of the catalog entity. */
    _catalogId: Option[String],
    /* The event code that a diagnostics aggregated number references */
    _code: Option[Integer],
    /* A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID') */
    _codeLabel: Option[String],
    /* Title message describing the diagnostic issue */
    _message: Option[String],
    /* Number of occurrences of the issue */
    _occurrences: Option[Integer],
    /* An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue */
    _severity: Option[String]
)
object CatalogsReportFeedIngestionStats {
    def toStringBody(var_reportType: Object, var_catalogId: Object, var_code: Object, var_codeLabel: Object, var_message: Object, var_occurrences: Object, var_severity: Object) =
        s"""
        | {
        | "reportType":$var_reportType,"catalogId":$var_catalogId,"code":$var_code,"codeLabel":$var_codeLabel,"message":$var_message,"occurrences":$var_occurrences,"severity":$var_severity
        | }
        """.stripMargin
}
