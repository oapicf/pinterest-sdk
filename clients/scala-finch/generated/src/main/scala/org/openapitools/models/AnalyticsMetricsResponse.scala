package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnalyticsMetricsResponseDailyMetrics
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param dailyUnderscoremetrics Array with the requested daily metric records
 * @param summaryUnderscoremetrics The metric name and value over the requested period for each requested metric
 */
case class AnalyticsMetricsResponse(dailyUnderscoremetrics: Option[Seq[AnalyticsMetricsResponseDailyMetrics]],
                summaryUnderscoremetrics: Option[Map[String, BigDecimal]]
                )

object AnalyticsMetricsResponse {
    /**
     * Creates the codec for converting AnalyticsMetricsResponse from and to JSON.
     */
    implicit val decoder: Decoder[AnalyticsMetricsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AnalyticsMetricsResponse] = deriveEncoder
}
