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
 * @param PRODUCTUnderscoreGROUPUnderscoreID The ID of the product group that this metrics belongs to.
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 */
case class ProductGroupAnalyticsResponseInner(PRODUCTUnderscoreGROUPUnderscoreID: String,
                DATE: Option[LocalDateTime]
                )

object ProductGroupAnalyticsResponseInner {
    /**
     * Creates the codec for converting ProductGroupAnalyticsResponseInner from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupAnalyticsResponseInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupAnalyticsResponseInner] = deriveEncoder
}
