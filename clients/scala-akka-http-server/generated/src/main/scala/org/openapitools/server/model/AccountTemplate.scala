package org.openapitools.server.model


/**
 * @param adAccountId ID of the Ad Account that owns the template for example: ''null''
 * @param adAccountIds IDs of the Ad Accounts that have access to this template for example: ''null''
 * @param adeColumns A list of ADE columns for example: ''["ADE_COST_PER_ACTION-download_picture"]''
 * @param attributionType Attribution type for Brand/Category/SKU reports for example: ''ADVERTISER_LEVEL''
 * @param clickWindowDays The length of the sliding window over which click conversions will be attributed for example: ''null''
 * @param columns A list of columns to be included in the report for example: ''null''
 * @param conversionReportTimeType Conversion report time type for example: ''null''
 * @param creationSource The surface used to create this template for example: ''null''
 * @param customColumnIds A list of custom column IDs for example: ''null''
 * @param displayMetadata Additional metadata about this reporting template for example: ''null''
 * @param engagementWindowDays The length of the sliding window over which engagement conversions will be attributed for example: ''null''
 * @param filtersJson A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values for example: ''null''
 * @param granularity  for example: ''null''
 * @param id Template ID for example: ''null''
 * @param ingestionSources The filter on the conversion ingestion source method for conversion metrics for example: ''null''
 * @param isDefault A boolean representing if this is the default view that loads for this template type for example: ''false''
 * @param isDeleted A boolean that indicates if the template has been deleted for example: ''null''
 * @param isOwnedByUser A boolean value that indicates if the user owns the template for example: ''null''
 * @param isScheduled A boolean value that indicates if this template has been used to create a scheduled report for example: ''null''
 * @param name Template Name for example: ''null''
 * @param reportEndRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will end for example: ''null''
 * @param reportFormat  for example: ''null''
 * @param reportLevel  for example: ''null''
 * @param reportStartRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will start for example: ''null''
 * @param reportingTimeZone Timezone for reporting data for example: ''null''
 * @param sortBy Unified metric sort configuration for example: ''null''
 * @param `type` Type of the template for example: ''null''
 * @param updatedTime Time of last update in seconds since Unix epoch for example: ''null''
 * @param userId ID of the user who created the template for example: ''null''
 * @param viewWindowDays The length of the sliding window over which view conversions will be attributed for example: ''null''
*/
final case class AccountTemplate (
  adAccountId: Option[String] = None,
  adAccountIds: Option[Seq[String]] = None,
  adeColumns: Option[Seq[String]] = None,
  attributionType: Option[AnyType] = None,
  clickWindowDays: Option[Double] = None,
  columns: Option[Seq[ReportingColumn]] = None,
  conversionReportTimeType: Option[ConversionReportTimeType] = None,
  creationSource: Option[CreationSource] = None,
  customColumnIds: Option[Seq[String]] = None,
  displayMetadata: Option[String] = None,
  engagementWindowDays: Option[Double] = None,
  filtersJson: Option[String] = None,
  granularity: Option[Granularity] = None,
  id: String,
  ingestionSources: Option[Seq[IngestionSource]] = None,
  isDefault: Option[Boolean] = None,
  isDeleted: Option[Boolean] = None,
  isOwnedByUser: Option[Boolean] = None,
  isScheduled: Option[Boolean] = None,
  name: Option[String] = None,
  reportEndRelativeDaysInPast: Option[Double] = None,
  reportFormat: Option[DataOutputFormat] = None,
  reportLevel: Option[MetricsReportingLevel] = None,
  reportStartRelativeDaysInPast: Option[Double] = None,
  reportingTimeZone: Option[ReportingTimeZone] = None,
  sortBy: Option[AnyType] = None,
  `type`: Option[String] = None,
  updatedTime: Option[Double] = None,
  userId: Option[String] = None,
  viewWindowDays: Option[Double] = None
)

