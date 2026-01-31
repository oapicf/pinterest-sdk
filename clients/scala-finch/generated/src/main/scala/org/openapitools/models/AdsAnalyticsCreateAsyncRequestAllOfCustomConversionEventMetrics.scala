package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param customUnderscoreeventUnderscoremetricsUnderscoretype Metrics for custom defined conversion event.
 * @param customUnderscoreeventUnderscorename Name of the advertiser-defined custom conversion event
 */
case class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics(customUnderscoreeventUnderscoremetricsUnderscoretype: String,
                customUnderscoreeventUnderscorename: String
                )

object AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics {
    /**
     * Creates the codec for converting AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics] = deriveEncoder
}
