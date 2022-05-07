package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionAttributionWindowDays
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.ConversionReportTimeType
import org.openapitools.models.Granularity
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
 */
case class AdsAnalyticsCreateAsyncRequestAllOf(startUnderscoredate: String,
                endUnderscoredate: String,
                granularity: Granularity,
                clickUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                engagementUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                viewUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                conversionUnderscorereportUnderscoretime: Option[ConversionReportTimeType],
                attributionUnderscoretypes: Option[Seq[ConversionReportAttributionType]]
                )

object AdsAnalyticsCreateAsyncRequestAllOf {
    /**
     * Creates the codec for converting AdsAnalyticsCreateAsyncRequestAllOf from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCreateAsyncRequestAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCreateAsyncRequestAllOf] = deriveEncoder
}
