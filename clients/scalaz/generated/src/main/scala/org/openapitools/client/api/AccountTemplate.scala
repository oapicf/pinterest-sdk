package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AccountTemplate._

case class AccountTemplate (
  /* ID of the Ad Account that owns the template */
  adAccountId: Option[String],
/* IDs of the Ad Accounts that have access to this template */
  adAccountIds: Option[List[String]],
/* A list of ADE columns */
  adeColumns: Option[List[String]],
/* Attribution type for Brand/Category/SKU reports */
  attributionType: Option[AnyType],
/* The length of the sliding window over which click conversions will be attributed */
  clickWindowDays: Option[BigDecimal],
/* A list of columns to be included in the report */
  columns: Option[List[ReportingColumn]],
/* Conversion report time type */
  conversionReportTimeType: Option[ConversionReportTimeType],
/* The surface used to create this template */
  creationSource: Option[CreationSource],
/* A list of custom column IDs */
  customColumnIds: Option[List[String]],
/* Additional metadata about this reporting template */
  displayMetadata: Option[String],
/* The length of the sliding window over which engagement conversions will be attributed */
  engagementWindowDays: Option[BigDecimal],
/* A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values */
  filtersJson: Option[String],
granularity: Option[Granularity],
/* Template ID */
  id: String,
/* The filter on the conversion ingestion source method for conversion metrics */
  ingestionSources: Option[List[IngestionSource]],
/* A boolean representing if this is the default view that loads for this template type */
  isDefault: Option[Boolean],
/* A boolean that indicates if the template has been deleted */
  isDeleted: Option[Boolean],
/* A boolean value that indicates if the user owns the template */
  isOwnedByUser: Option[Boolean],
/* A boolean value that indicates if this template has been used to create a scheduled report */
  isScheduled: Option[Boolean],
/* Template Name */
  name: Option[String],
/* The number of days prior to the day the report will be delivered at which the report will end */
  reportEndRelativeDaysInPast: Option[BigDecimal],
reportFormat: Option[DataOutputFormat],
reportLevel: Option[MetricsReportingLevel],
/* The number of days prior to the day the report will be delivered at which the report will start */
  reportStartRelativeDaysInPast: Option[BigDecimal],
/* Timezone for reporting data */
  reportingTimeZone: Option[ReportingTimeZone],
/* Unified metric sort configuration */
  sortBy: Option[AnyType],
/* Type of the template */
  `type`: Option[String],
/* Time of last update in seconds since Unix epoch */
  updatedTime: Option[BigDecimal],
/* ID of the user who created the template */
  userId: Option[String],
/* The length of the sliding window over which view conversions will be attributed */
  viewWindowDays: Option[BigDecimal])

object AccountTemplate {
  import DateTimeCodecs._

  implicit val AccountTemplateCodecJson: CodecJson[AccountTemplate] = CodecJson.derive[AccountTemplate]
  implicit val AccountTemplateDecoder: EntityDecoder[AccountTemplate] = jsonOf[AccountTemplate]
  implicit val AccountTemplateEncoder: EntityEncoder[AccountTemplate] = jsonEncoderOf[AccountTemplate]
}
