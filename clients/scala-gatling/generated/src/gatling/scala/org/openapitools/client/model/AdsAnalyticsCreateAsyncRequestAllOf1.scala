
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncRequestAllOf1 (
    /* Metric and entity columns */
    _columns: List[ReportingColumnAsync],
    /* Level of the report */
    _level: MetricsReportingLevel,
    /* Specification for formatting report data */
    _reportFormat: Option[DataOutputFormat]
)
object AdsAnalyticsCreateAsyncRequestAllOf1 {
    def toStringBody(var_columns: Object, var_level: Object, var_reportFormat: Object) =
        s"""
        | {
        | "columns":$var_columns,"level":$var_level,"reportFormat":$var_reportFormat
        | }
        """.stripMargin
}
