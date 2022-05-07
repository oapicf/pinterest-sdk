package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param dataUnderscorestatus Metrics availablity, e.g., \"READY\".
 * @param date Metrics date (UTC): YYYY-MM-DD.
 * @param metrics The metric name and daily value for each requested metric
 */
case class AnalyticsMetricsResponseDailyMetrics(dataUnderscorestatus: Option[String],
                date: Option[String],
                metrics: Option[Map[String, BigDecimal]]
                )

object AnalyticsMetricsResponseDailyMetrics {
    /**
     * Creates the codec for converting AnalyticsMetricsResponseDailyMetrics from and to JSON.
     */
    implicit val decoder: Decoder[AnalyticsMetricsResponseDailyMetrics] = deriveDecoder
    implicit val encoder: ObjectEncoder[AnalyticsMetricsResponseDailyMetrics] = deriveEncoder
}
