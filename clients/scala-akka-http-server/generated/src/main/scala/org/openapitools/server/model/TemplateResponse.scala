package org.openapitools.server.model


/**
 * Template fields
 *
 * @param adAccountId ID of the Ad Account that owns the template for example: ''547664674848''
 * @param adAccountIds IDs of the Ad Accounts that have access to this template for example: ''["547664674848"]''
 * @param clickWindowDays The length of the sliding window over which click conversions will be attributed for example: ''7''
 * @param columns A list of columns to be included in the report for example: ''["SPEND_IN_DOLLAR"]''
 * @param conversionReportTimeType Conversion report time type for example: ''TIME_OF_AD_ACTION''
 * @param creationSource The surface used to create this template for example: ''ADS_MANAGER_REPORT_BUILDER''
 * @param customColumnIds A list of custom column IDs for example: ''["1597252063"]''
 * @param dateRange  for example: ''null''
 * @param engagementWindowDays The length of the sliding window over which engagement conversions will be attributed for example: ''7''
 * @param filtersJson A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values for example: ''[{"field": "SPEND_IN_DOLLAR", "operator": "=", "value": 100}]''
 * @param granularity  for example: ''null''
 * @param id Template ID for example: ''6739202847590''
 * @param ingestionSources The filter on the conversion ingestion source method for conversion metrics for example: ''null''
 * @param isDeleted A boolean that indicates if the template has been deleted for example: ''false''
 * @param isOwnedByUser A boolean value that indicates if the user owns the template for example: ''true''
 * @param isScheduled A boolean value that indicates if this template has been used to create a scheduled report for example: ''true''
 * @param name Template Name for example: ''Week over week spend''
 * @param reportEndRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will end for example: ''7''
 * @param reportFormat  for example: ''null''
 * @param reportLevel  for example: ''null''
 * @param reportStartRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will start for example: ''7''
 * @param `type` Reporting template type for example: ''BULK''
 * @param updatedTime Time of last update in seconds since Unix epoch for example: ''1432744744''
 * @param userId ID of the user who created the template for example: ''784762938748396''
 * @param viewWindowDays The length of the sliding window over which view conversions will be attributed for example: ''7''
*/
final case class TemplateResponse (
  adAccountId: Option[String] = None,
  adAccountIds: Option[Seq[String]] = None,
  clickWindowDays: Option[Double] = None,
  columns: Option[Seq[String]] = None,
  conversionReportTimeType: Option[String] = None,
  creationSource: Option[String] = None,
  customColumnIds: Option[Seq[String]] = None,
  dateRange: Option[TemplateResponseDateRange] = None,
  engagementWindowDays: Option[Double] = None,
  filtersJson: Option[String] = None,
  granularity: Option[Granularity] = None,
  id: Option[String] = None,
  ingestionSources: Option[Seq[String]] = None,
  isDeleted: Option[Boolean] = None,
  isOwnedByUser: Option[Boolean] = None,
  isScheduled: Option[Boolean] = None,
  name: Option[String] = None,
  reportEndRelativeDaysInPast: Option[Double] = None,
  reportFormat: Option[DataOutputFormat] = None,
  reportLevel: Option[MetricsReportingLevel] = None,
  reportStartRelativeDaysInPast: Option[Double] = None,
  `type`: Option[String] = None,
  updatedTime: Option[Double] = None,
  userId: Option[String] = None,
  viewWindowDays: Option[Double] = None
)

