package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnalyticsDailyMetrics
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param summaryUnderscoremetrics The metric name and value over the requested period for each requested metric
 * @param dailyUnderscoremetrics Array with the requested daily metric records
 */
case class AnalyticsMetricsResponse(summaryUnderscoremetrics: Option[Map[String, BigDecimal]],
                dailyUnderscoremetrics: Option[Seq[AnalyticsDailyMetrics]]
                )

object AnalyticsMetricsResponse {
    /**
     * Creates the codec for converting AnalyticsMetricsResponse from and to JSON.
     */
    implicit val decoder: Decoder[AnalyticsMetricsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AnalyticsMetricsResponse] = deriveEncoder
}
