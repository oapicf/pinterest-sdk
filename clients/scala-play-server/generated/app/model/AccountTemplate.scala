package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AccountTemplate.
  * @param adAccountId ID of the Ad Account that owns the template
  * @param adAccountIds IDs of the Ad Accounts that have access to this template
  * @param adeColumns A list of ADE columns
  * @param attributionType Attribution type for Brand/Category/SKU reports
  * @param clickWindowDays The length of the sliding window over which click conversions will be attributed
  * @param columns A list of columns to be included in the report
  * @param conversionReportTimeType Conversion report time type
  * @param creationSource The surface used to create this template
  * @param customColumnIds A list of custom column IDs
  * @param displayMetadata Additional metadata about this reporting template
  * @param engagementWindowDays The length of the sliding window over which engagement conversions will be attributed
  * @param filtersJson A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
  * @param id Template ID
  * @param ingestionSources The filter on the conversion ingestion source method for conversion metrics
  * @param isDefault A boolean representing if this is the default view that loads for this template type
  * @param isDeleted A boolean that indicates if the template has been deleted
  * @param isOwnedByUser A boolean value that indicates if the user owns the template
  * @param isScheduled A boolean value that indicates if this template has been used to create a scheduled report
  * @param name Template Name
  * @param reportEndRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will end
  * @param reportStartRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will start
  * @param reportingTimeZone Timezone for reporting data
  * @param sortBy Unified metric sort configuration
  * @param `type` Type of the template
  * @param updatedTime Time of last update in seconds since Unix epoch
  * @param userId ID of the user who created the template
  * @param viewWindowDays The length of the sliding window over which view conversions will be attributed
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AccountTemplate(
  adAccountId: Option[String],
  adAccountIds: Option[List[String]],
  adeColumns: Option[List[String]],
  attributionType: Option[OasAnyTypeNotMapped],
  clickWindowDays: Option[BigDecimal],
  columns: Option[List[ReportingColumn]],
  conversionReportTimeType: Option[ConversionReportTimeType],
  creationSource: Option[CreationSource],
  customColumnIds: Option[List[String]],
  displayMetadata: Option[String],
  engagementWindowDays: Option[BigDecimal],
  filtersJson: Option[String],
  granularity: Option[Granularity],
  id: String,
  ingestionSources: Option[List[IngestionSource]],
  isDefault: Option[Boolean],
  isDeleted: Option[Boolean],
  isOwnedByUser: Option[Boolean],
  isScheduled: Option[Boolean],
  name: Option[String],
  reportEndRelativeDaysInPast: Option[BigDecimal],
  reportFormat: Option[DataOutputFormat],
  reportLevel: Option[MetricsReportingLevel],
  reportStartRelativeDaysInPast: Option[BigDecimal],
  reportingTimeZone: Option[ReportingTimeZone],
  sortBy: Option[OasAnyTypeNotMapped],
  `type`: Option[String],
  updatedTime: Option[BigDecimal],
  userId: Option[String],
  viewWindowDays: Option[BigDecimal]
)

object AccountTemplate {
  implicit lazy val accountTemplateJsonFormat: Format[AccountTemplate] = Json.format[AccountTemplate]
}

