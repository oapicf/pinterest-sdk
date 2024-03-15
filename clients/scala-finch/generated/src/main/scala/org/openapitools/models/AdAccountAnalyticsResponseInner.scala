package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.LocalDateTime
import org.openapitools.models.AnyType
import scala.collection.immutable.HashMap

/**
 * 
 * @param ADUnderscoreACCOUNTUnderscoreID The ID of the advertiser that this metrics belongs to.
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 */
case class AdAccountAnalyticsResponseInner(ADUnderscoreACCOUNTUnderscoreID: String,
                DATE: Option[LocalDateTime]
                )

object AdAccountAnalyticsResponseInner {
    /**
     * Creates the codec for converting AdAccountAnalyticsResponseInner from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountAnalyticsResponseInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountAnalyticsResponseInner] = deriveEncoder
}
