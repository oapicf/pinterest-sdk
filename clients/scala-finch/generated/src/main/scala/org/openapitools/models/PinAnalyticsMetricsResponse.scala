package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.PinAnalyticsMetricsResponseDailyMetricsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param lifetimeUnderscoremetrics The lifetime metric name and value.
 * @param dailyUnderscoremetrics Array with the requested daily metric records
 * @param summaryUnderscoremetrics The metric name and value over the requested period for each requested metric
 */
case class PinAnalyticsMetricsResponse(lifetimeUnderscoremetrics: Option[Map[String, Int]],
                dailyUnderscoremetrics: Option[Seq[PinAnalyticsMetricsResponseDailyMetricsInner]],
                summaryUnderscoremetrics: Option[Map[String, BigDecimal]]
                )

object PinAnalyticsMetricsResponse {
    /**
     * Creates the codec for converting PinAnalyticsMetricsResponse from and to JSON.
     */
    implicit val decoder: Decoder[PinAnalyticsMetricsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinAnalyticsMetricsResponse] = deriveEncoder
}
