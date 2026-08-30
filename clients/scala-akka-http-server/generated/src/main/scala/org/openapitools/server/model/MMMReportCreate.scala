package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param advertiserIds Advertiser IDs for multi-advertiser report for example: ''null''
 * @param columns Metric and entity columns for example: ''null''
 * @param countries A List of countries for filtering for example: ''null''
 * @param customColumnIds List of custom column IDs for example: ''null''
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param granularity   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. for example: ''null''
 * @param level Level of the report for example: ''null''
 * @param reportName Name of the Marketing Mix Modeling (MMM) report for example: ''null''
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param targetingTypes List of targeting types for example: ''["GENDER"]''
*/
final case class MMMReportCreate (
  advertiserIds: Option[Seq[String]] = None,
  columns: Seq[MMMReportingColumn],
  countries: Option[Seq[TargetingAdvertiserCountry]] = None,
  customColumnIds: Option[Seq[String]] = None,
  endDate: String,
  granularity: MMMReportGranularity,
  level: MMMReportLevel,
  reportName: String,
  startDate: String,
  targetingTypes: Seq[MMMReportingTargetingType]
)

