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
 * @param ADUnderscoreGROUPUnderscoreID The ID of the ad group that this metrics belongs to.
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 */
case class AdGroupsAnalyticsResponseInner(ADUnderscoreGROUPUnderscoreID: String,
                DATE: Option[LocalDateTime]
                )

object AdGroupsAnalyticsResponseInner {
    /**
     * Creates the codec for converting AdGroupsAnalyticsResponseInner from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupsAnalyticsResponseInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupsAnalyticsResponseInner] = deriveEncoder
}
