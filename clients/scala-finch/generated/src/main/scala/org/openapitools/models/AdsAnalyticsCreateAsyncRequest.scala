package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupSummaryStatus
import org.openapitools.models.AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
import org.openapitools.models.AdsAnalyticsMetricsFilter
import org.openapitools.models.CampaignSummaryStatus
import org.openapitools.models.ConversionAttributionWindowDays
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.ConversionReportTimeType
import org.openapitools.models.DataOutputFormat
import org.openapitools.models.Granularity
import org.openapitools.models.MetricsReportingLevel
import org.openapitools.models.ObjectiveType
import org.openapitools.models.PinPromotionSummaryStatus
import org.openapitools.models.ProductGroupSummaryStatus
import org.openapitools.models.ReportingColumnAsync
import org.openapitools.models.ReportingTimeZone
import scala.collection.immutable.Seq

/**
 * 
 * @param attributionUnderscoretypes List of types of attribution for the conversion report
 * @param clickUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param conversionUnderscorereportUnderscoretime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param endUnderscoredate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param engagementUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
 * @param startUnderscoredate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param viewUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * @param campaignUnderscoreids List of campaign ids
 * @param campaignUnderscorestatuses List of status values for filtering
 * @param campaignUnderscoreobjectiveUnderscoretypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
 * @param campaignUnderscorebrandUnderscorelabel Campaign brand label for filtering.
 * @param adUnderscoregroupUnderscoreids List of ad group ids
 * @param adUnderscoregroupUnderscorestatuses List of values for filtering
 * @param adUnderscoreids List of ad ids [This parameter is no supported for Product Item Level Reports]
 * @param adUnderscorestatuses List of values for filtering [This parameter is not supported for Product Item Level Reports]
 * @param productUnderscoregroupUnderscoreids List of product group ids
 * @param productUnderscoregroupUnderscorestatuses List of values for filtering
 * @param productUnderscoreitemUnderscoreids List of product item ids
 * @param targetingUnderscoretypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
 * @param metricsUnderscorefilters List of metrics filters
 * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
 * @param combineUnderscoretargetingUnderscoretypes Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
 * @param customUnderscoreconversionUnderscoreeventUnderscoremetrics List of advertiser-defined custom conversion event metrics to include in the report
 * @param endUnderscorehour Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
 * @param level Level of the report
 * @param primaryUnderscoresort Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
 * @param reportUnderscoreformat Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
 * @param reportingUnderscoretimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
 * @param startUnderscorehour Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
 */
case class AdsAnalyticsCreateAsyncRequest(attributionUnderscoretypes: Option[Seq[ConversionReportAttributionType]],
                clickUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                conversionUnderscorereportUnderscoretime: Option[ConversionReportTimeType],
                endUnderscoredate: String,
                engagementUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                granularity: Granularity,
                startUnderscoredate: String,
                viewUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                campaignUnderscoreids: Option[Seq[String]],
                campaignUnderscorestatuses: Option[Seq[CampaignSummaryStatus]],
                campaignUnderscoreobjectiveUnderscoretypes: Option[Seq[ObjectiveType]],
                campaignUnderscorebrandUnderscorelabel: Option[String],
                adUnderscoregroupUnderscoreids: Option[Seq[String]],
                adUnderscoregroupUnderscorestatuses: Option[Seq[AdGroupSummaryStatus]],
                adUnderscoreids: Option[Seq[String]],
                adUnderscorestatuses: Option[Seq[PinPromotionSummaryStatus]],
                productUnderscoregroupUnderscoreids: Option[Seq[String]],
                productUnderscoregroupUnderscorestatuses: Option[Seq[ProductGroupSummaryStatus]],
                productUnderscoreitemUnderscoreids: Option[Seq[String]],
                targetingUnderscoretypes: Option[Seq[String]],
                metricsUnderscorefilters: Option[Seq[AdsAnalyticsMetricsFilter]],
                columns: Seq[ReportingColumnAsync],
                combineUnderscoretargetingUnderscoretypes: Option[Boolean],
                customUnderscoreconversionUnderscoreeventUnderscoremetrics: Option[Seq[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics]],
                endUnderscorehour: Option[Int],
                level: MetricsReportingLevel,
                primaryUnderscoresort: Option[String],
                reportUnderscoreformat: Option[DataOutputFormat],
                reportingUnderscoretimezone: Option[ReportingTimeZone],
                startUnderscorehour: Option[Int]
                )

object AdsAnalyticsCreateAsyncRequest {
    /**
     * Creates the codec for converting AdsAnalyticsCreateAsyncRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCreateAsyncRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCreateAsyncRequest] = deriveEncoder
}
