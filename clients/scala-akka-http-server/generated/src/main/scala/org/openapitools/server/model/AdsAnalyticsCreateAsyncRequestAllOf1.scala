package org.openapitools.server.model


/**
 * @param columns Metric and entity columns for example: ''null''
 * @param level Level of the report for example: ''CAMPAIGN''
 * @param reportFormat Specification for formatting report data for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncRequestAllOf1 (
  columns: Seq[ReportingColumnAsync],
  level: MetricsReportingLevel,
  reportFormat: Option[DataOutputFormat]
)

