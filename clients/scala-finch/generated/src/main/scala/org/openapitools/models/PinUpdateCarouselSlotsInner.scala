package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param title Carousel Pin slot title.
 * @param description Carousel Pin slot description.
 * @param link Carousel Pin slot link.
 */
case class PinUpdateCarouselSlotsInner(title: Option[String],
                description: Option[String],
                link: Option[String]
                )

object PinUpdateCarouselSlotsInner {
    /**
     * Creates the codec for converting PinUpdateCarouselSlotsInner from and to JSON.
     */
    implicit val decoder: Decoder[PinUpdateCarouselSlotsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinUpdateCarouselSlotsInner] = deriveEncoder
}
