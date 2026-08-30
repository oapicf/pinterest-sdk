package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsCreateAsyncRequest._

case class AdsAnalyticsCreateAsyncRequest (
  /* List of ad group ids */
  adGroupIds: Option[List[String]],
/* List of values for filtering */
  adGroupStatuses: Option[List[AdGroupSummaryStatus]],
/* List of ad ids. This parameter is not supported for Product Item level reports. */
  adIds: Option[List[String]],
/* List of values for filtering. This parameter is not supported for Product Item level reports. */
  adStatuses: Option[List[PinPromotionSummaryStatus]],
/* List of attribution types for the conversion report. */
  attributionTypes: Option[List[ConversionReportAttributionType]],
/* Campaign brand label for filtering. */
  campaignBrandLabel: Option[String],
/* Campaign custom label for filtering. */
  campaignCustomLabel: Option[String],
/* List of campaign ids */
  campaignIds: Option[List[String]],
/* List of values for filtering. [\"WEB_SESSIONS\"] is in BETA. */
  campaignObjectiveTypes: Option[List[CampaignObjectiveType]],
/* List of status values for filtering */
  campaignStatuses: Option[List[CampaignSummaryStatus]],
/* Number of days to use as the conversion attribution window for a pin click action. */
  clickWindowDays: Option[ConversionAttributionWindowDays],
/* Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. */
  columns: Option[List[ReportingColumnAsync]],
/* Determines if the targeting types included in the request should be consolidated into a single breakdown. */
  combineTargetingTypes: Option[Boolean],
/* Date dimension for conversion metrics. */
  conversionReportTime: Option[ConversionReportTimeType],
/* List of advertiser-defined custom conversion event metrics to include in the report */
  customConversionEventMetrics: Option[List[CustomConversionEventMetrics]],
/* Metric report end date (UTC). Format: YYYY-MM-DD */
  endDate: String,
/* Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. */
  endHour: Option[Integer],
/* Number of days to use as the conversion attribution window for an engagement action. */
  engagementWindowDays: Option[ConversionAttributionWindowDays],
/*   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. */
  granularity: Granularity,
/* Level of the report */
  level: Option[MetricsReportingLevel],
/* List of metrics filters */
  metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
primarySort: Option[PrimarySort],
/* List of product group ids */
  productGroupIds: Option[List[String]],
/* List of values for filtering */
  productGroupStatuses: Option[List[ProductGroupSummaryStatus]],
/* List of product item ids */
  productItemIds: Option[List[String]],
reportFormat: Option[DataOutputFormat],
/* Specify the timezone to be applied for the reporting. */
  reportingTimezone: Option[ReportingTimeZone],
/* Metric report start date (UTC). Format: YYYY-MM-DD */
  startDate: String,
/* Which hour of the start date to begin the report. Only allowed for hourly reports. */
  startHour: Option[Integer],
/* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. */
  targetingTypes: Option[List[AdAdsAnalyticsAsyncTargetingTypes]],
/* Number of days to use as the conversion attribution window for a view action. */
  viewWindowDays: Option[ConversionAttributionWindowDays])

object AdsAnalyticsCreateAsyncRequest {
  import DateTimeCodecs._

  implicit val AdsAnalyticsCreateAsyncRequestCodecJson: CodecJson[AdsAnalyticsCreateAsyncRequest] = CodecJson.derive[AdsAnalyticsCreateAsyncRequest]
  implicit val AdsAnalyticsCreateAsyncRequestDecoder: EntityDecoder[AdsAnalyticsCreateAsyncRequest] = jsonOf[AdsAnalyticsCreateAsyncRequest]
  implicit val AdsAnalyticsCreateAsyncRequestEncoder: EntityEncoder[AdsAnalyticsCreateAsyncRequest] = jsonEncoderOf[AdsAnalyticsCreateAsyncRequest]
}
