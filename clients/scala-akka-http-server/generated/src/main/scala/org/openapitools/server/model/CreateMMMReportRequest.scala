package org.openapitools.server.model


/**
 * @param reportName Name of the Marketing Mix Modeling (MMM) report for example: ''null''
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. for example: ''null''
 * @param level Level of the report for example: ''null''
 * @param targetingTypes List of targeting types for example: ''["GENDER"]''
 * @param columns Metric and entity columns for example: ''null''
 * @param countries A List of countries for filtering for example: ''null''
*/
final case class CreateMMMReportRequest (
  reportName: String,
  startDate: String,
  endDate: String,
  granularity: String,
  level: String,
  targetingTypes: Seq[MMMReportingTargetingType],
  columns: Seq[MMMReportingColumn],
  countries: Option[Seq[TargetingAdvertiserCountry]] = None
)

