/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class TemplateResponse(
  /* Template ID */
  id: Option[String],

  /* ID of the Ad Account that owns the template */
  adAccountId: Option[String],

  /* IDs of the Ad Accounts that have access to this template */
  adAccountIds: Option[List[String]],

  /* ID of the user who created the template */
  userId: Option[String],

  /* Template Name */
  name: Option[String],

  /* The number of days prior to the day the report will be delivered at which the report will start */
  reportStartRelativeDaysInPast: Option[Double],

  /* The number of days prior to the day the report will be delivered at which the report will end */
  reportEndRelativeDaysInPast: Option[Double],

  dateRange: Option[TemplateResponseDateRange],

  reportLevel: Option[MetricsReportingLevel],

  reportFormat: Option[DataOutputFormat],

  /* A list of columns to be included in the report */
  columns: Option[List[String]],

  granularity: Option[Granularity],

  /* The length of the sliding window over which view conversions will be attributed */
  viewWindowDays: Option[Double],

  /* The length of the sliding window over which click conversions will be attributed */
  clickWindowDays: Option[Double],

  /* The length of the sliding window over which engagement conversions will be attributed */
  engagementWindowDays: Option[Double],

  /* Conversion report time type */
  conversionReportTimeType: Option[String],

  /* A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values */
  filtersJson: Option[String],

  /* A boolean value that indicates if the user owns the template */
  isOwnedByUser: Option[Boolean],

  /* A boolean value that indicates if this template has been used to create a scheduled report */
  isScheduled: Option[Boolean],

  /* The surface used to create this template */
  creationSource: Option[String],

  /* A boolean that indicates if the template has been deleted */
  isDeleted: Option[Boolean],

  /* Time of last update in seconds since Unix epoch */
  updatedTime: Option[Double],

  /* A list of custom column IDs */
  customColumnIds: Option[List[String]],

  /* Reporting template type */
  `type`: Option[String],

  /* The filter on the conversion ingestion source method for conversion metrics */
  ingestionSources: Option[List[String]]

 )
