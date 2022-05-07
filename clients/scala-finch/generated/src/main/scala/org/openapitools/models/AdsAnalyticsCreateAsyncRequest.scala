package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupSummaryStatus
import org.openapitools.models.AdsAnalyticsCreateAsyncRequestAllOf
import org.openapitools.models.AdsAnalyticsCreateAsyncRequestAllOf1
import org.openapitools.models.AdsAnalyticsMetricsFilter
import org.openapitools.models.AdsAnalyticsTargetingType
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
import scala.collection.immutable.Seq

/**
 * 
 * @param startUnderscoredate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param endUnderscoredate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
 * @param clickUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param engagementUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param viewUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * @param conversionUnderscorereportUnderscoretime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param attributionUnderscoretypes List of types of attribution for the conversion report
 * @param columns Metric and entity columns
 * @param level Level of the report
 * @param reportUnderscoreformat Specification for formatting report data
 * @param campaignUnderscoreids List of campaign ids
 * @param campaignUnderscorestatuses List of status values for filtering
 * @param campaignUnderscoreobjectiveUnderscoretypes List of values for filtering
 * @param adUnderscoregroupUnderscoreids List of ad group ids
 * @param adUnderscoregroupUnderscorestatuses List of values for filtering
 * @param adUnderscoreids List of ad ids
 * @param adUnderscorestatuses List of values for filtering
 * @param productUnderscoregroupUnderscoreids List of product group ids
 * @param productUnderscoregroupUnderscorestatuses List of values for filtering
 * @param productUnderscoreitemUnderscoreids List of product item ids
 * @param targetingUnderscoretypes List of targeting types
 * @param metricsUnderscorefilters List of metrics filters
 */
case class AdsAnalyticsCreateAsyncRequest(startUnderscoredate: String,
                endUnderscoredate: String,
                granularity: Granularity,
                clickUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                engagementUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                viewUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                conversionUnderscorereportUnderscoretime: Option[ConversionReportTimeType],
                attributionUnderscoretypes: Option[Seq[ConversionReportAttributionType]],
                columns: Seq[ReportingColumnAsync],
                level: MetricsReportingLevel,
                reportUnderscoreformat: Option[DataOutputFormat],
                campaignUnderscoreids: Option[Seq[String]],
                campaignUnderscorestatuses: Option[Seq[CampaignSummaryStatus]],
                campaignUnderscoreobjectiveUnderscoretypes: Option[Seq[ObjectiveType]],
                adUnderscoregroupUnderscoreids: Option[Seq[String]],
                adUnderscoregroupUnderscorestatuses: Option[Seq[AdGroupSummaryStatus]],
                adUnderscoreids: Option[Seq[String]],
                adUnderscorestatuses: Option[Seq[PinPromotionSummaryStatus]],
                productUnderscoregroupUnderscoreids: Option[Seq[String]],
                productUnderscoregroupUnderscorestatuses: Option[Seq[ProductGroupSummaryStatus]],
                productUnderscoreitemUnderscoreids: Option[Seq[String]],
                targetingUnderscoretypes: Option[Seq[AdsAnalyticsTargetingType]],
                metricsUnderscorefilters: Option[Seq[AdsAnalyticsMetricsFilter]]
                )

object AdsAnalyticsCreateAsyncRequest {
    /**
     * Creates the codec for converting AdsAnalyticsCreateAsyncRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCreateAsyncRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCreateAsyncRequest] = deriveEncoder
}
