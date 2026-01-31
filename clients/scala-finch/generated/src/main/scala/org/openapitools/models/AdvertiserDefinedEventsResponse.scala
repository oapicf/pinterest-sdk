package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvertiserDefinedEvent
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class AdvertiserDefinedEventsResponse(items: Option[Seq[AdvertiserDefinedEvent]]
                )

object AdvertiserDefinedEventsResponse {
    /**
     * Creates the codec for converting AdvertiserDefinedEventsResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdvertiserDefinedEventsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvertiserDefinedEventsResponse] = deriveEncoder
}
