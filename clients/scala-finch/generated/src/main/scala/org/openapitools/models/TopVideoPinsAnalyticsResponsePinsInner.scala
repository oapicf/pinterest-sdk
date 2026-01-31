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
 * @param dataUnderscorestatus 
 * @param metrics The metric name and daily value for each requested metric
 * @param pinUnderscoreid The pin id
 */
case class TopVideoPinsAnalyticsResponsePinsInner(dataUnderscorestatus: Option[Map[String, DataStatus]],
                metrics: Option[Map[String, BigDecimal]],
                pinUnderscoreid: Option[String]
                )

object TopVideoPinsAnalyticsResponsePinsInner {
    /**
     * Creates the codec for converting TopVideoPinsAnalyticsResponsePinsInner from and to JSON.
     */
    implicit val decoder: Decoder[TopVideoPinsAnalyticsResponsePinsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[TopVideoPinsAnalyticsResponsePinsInner] = deriveEncoder
}
