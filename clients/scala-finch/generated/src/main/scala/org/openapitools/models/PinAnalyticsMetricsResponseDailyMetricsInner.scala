package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.DataStatus

/**
 * 
 * @param dataUnderscorestatus 
 * @param date Metrics date (UTC): YYYY-MM-DD.
 * @param metrics The metric name and daily value for each requested metric
 */
case class PinAnalyticsMetricsResponseDailyMetricsInner(dataUnderscorestatus: Option[DataStatus],
                date: Option[String],
                metrics: Option[Map[String, BigDecimal]]
                )

object PinAnalyticsMetricsResponseDailyMetricsInner {
    /**
     * Creates the codec for converting PinAnalyticsMetricsResponseDailyMetricsInner from and to JSON.
     */
    implicit val decoder: Decoder[PinAnalyticsMetricsResponseDailyMetricsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinAnalyticsMetricsResponseDailyMetricsInner] = deriveEncoder
}
