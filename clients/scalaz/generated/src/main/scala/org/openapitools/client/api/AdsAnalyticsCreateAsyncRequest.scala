package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsCreateAsyncRequest._

case class AdsAnalyticsCreateAsyncRequest (
  /* List of types of attribution for the conversion report */
  attributionTypes: Option[List[ConversionReportAttributionType]],
/* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
  clickWindowDays: Option[ConversionAttributionWindowDays],
/* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
  conversionReportTime: Option[ConversionReportTimeType],
/* Metric report end date (UTC). Format: YYYY-MM-DD */
  endDate: String,
/* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
  engagementWindowDays: Option[ConversionAttributionWindowDays],
/* TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly */
  granularity: Granularity,
/* Metric report start date (UTC). Format: YYYY-MM-DD */
  startDate: String,
/* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
  viewWindowDays: Option[ConversionAttributionWindowDays],
/* List of campaign ids */
  campaignIds: Option[List[String]],
/* List of status values for filtering */
  campaignStatuses: Option[List[CampaignSummaryStatus]],
/* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
  campaignObjectiveTypes: Option[List[ObjectiveType]],
/* Campaign brand label for filtering. */
  campaignBrandLabel: Option[String],
/* List of ad group ids */
  adGroupIds: Option[List[String]],
/* List of values for filtering */
  adGroupStatuses: Option[List[AdGroupSummaryStatus]],
/* List of ad ids [This parameter is no supported for Product Item Level Reports] */
  adIds: Option[List[String]],
/* List of values for filtering [This parameter is not supported for Product Item Level Reports] */
  adStatuses: Option[List[PinPromotionSummaryStatus]],
/* List of product group ids */
  productGroupIds: Option[List[String]],
/* List of values for filtering */
  productGroupStatuses: Option[List[ProductGroupSummaryStatus]],
/* List of product item ids */
  productItemIds: Option[List[String]],
/* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
  targetingTypes: Option[List[TargetingTypes]],
/* List of metrics filters */
  metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
/* Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. */
  columns: List[ReportingColumnAsync],
/* Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users. */
  combineTargetingTypes: Option[Boolean],
/* List of advertiser-defined custom conversion event metrics to include in the report */
  customConversionEventMetrics: Option[List[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics]],
/* Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports. */
  endHour: Option[Integer],
/* Level of the report */
  level: MetricsReportingLevel,
/* Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. */
  primarySort: Option[PrimarySort],
/* Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. */
  reportFormat: Option[DataOutputFormat],
/* Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. */
  reportingTimezone: Option[ReportingTimeZone],
/* Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. */
  startHour: Option[Integer])

object AdsAnalyticsCreateAsyncRequest {
  import DateTimeCodecs._
  sealed trait List[TargetingTypes]

  object List[TargetingTypes] {
    def toList[TargetingTypes](s: String): Option[List[TargetingTypes]] = s match {
      case _ => None
    }

    def fromList[TargetingTypes](x: List[TargetingTypes]): String = x match {
    }
  }

  implicit val List[TargetingTypes]EnumEncoder: EncodeJson[List[TargetingTypes]] =
    EncodeJson[List[TargetingTypes]](is => StringEncodeJson(List[TargetingTypes].fromList[TargetingTypes](is)))

  implicit val List[TargetingTypes]EnumDecoder: DecodeJson[List[TargetingTypes]] =
    DecodeJson.optionDecoder[List[TargetingTypes]](n => n.string.flatMap(jStr => List[TargetingTypes].toList[TargetingTypes](jStr)), "List[TargetingTypes] failed to de-serialize")
  sealed trait PrimarySort
  case object BYID extends PrimarySort
  case object BYDATE extends PrimarySort

  object PrimarySort {
    def toPrimarySort(s: String): Option[PrimarySort] = s match {
      case "BYID" => Some(BYID)
      case "BYDATE" => Some(BYDATE)
      case _ => None
    }

    def fromPrimarySort(x: PrimarySort): String = x match {
      case BYID => "BYID"
      case BYDATE => "BYDATE"
    }
  }

  implicit val PrimarySortEnumEncoder: EncodeJson[PrimarySort] =
    EncodeJson[PrimarySort](is => StringEncodeJson(PrimarySort.fromPrimarySort(is)))

  implicit val PrimarySortEnumDecoder: DecodeJson[PrimarySort] =
    DecodeJson.optionDecoder[PrimarySort](n => n.string.flatMap(jStr => PrimarySort.toPrimarySort(jStr)), "PrimarySort failed to de-serialize")

  implicit val AdsAnalyticsCreateAsyncRequestCodecJson: CodecJson[AdsAnalyticsCreateAsyncRequest] = CodecJson.derive[AdsAnalyticsCreateAsyncRequest]
  implicit val AdsAnalyticsCreateAsyncRequestDecoder: EntityDecoder[AdsAnalyticsCreateAsyncRequest] = jsonOf[AdsAnalyticsCreateAsyncRequest]
  implicit val AdsAnalyticsCreateAsyncRequestEncoder: EntityEncoder[AdsAnalyticsCreateAsyncRequest] = jsonEncoderOf[AdsAnalyticsCreateAsyncRequest]
}
