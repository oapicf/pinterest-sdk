package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.DataStatus

/**
 * Array with metrics, status, and pin id for the requested metric
 * @param metrics The metric name and daily value for each requested metric
 * @param dataUnderscorestatus 
 * @param pinUnderscoreid The pin id
 */
case class TopPinsAnalyticsResponsePinsInner(metrics: Option[Map[String, BigDecimal]],
                dataUnderscorestatus: Option[Map[String, DataStatus]],
                pinUnderscoreid: Option[String]
                )

object TopPinsAnalyticsResponsePinsInner {
    /**
     * Creates the codec for converting TopPinsAnalyticsResponsePinsInner from and to JSON.
     */
    implicit val decoder: Decoder[TopPinsAnalyticsResponsePinsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[TopPinsAnalyticsResponsePinsInner] = deriveEncoder
}
