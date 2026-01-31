package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param description Carousel Pin slot description.
 * @param link Carousel Pin slot link.
 * @param title Carousel Pin slot title.
 */
case class CarouselSlot(description: Option[String],
                link: Option[String],
                title: Option[String]
                )

object CarouselSlot {
    /**
     * Creates the codec for converting CarouselSlot from and to JSON.
     */
    implicit val decoder: Decoder[CarouselSlot] = deriveDecoder
    implicit val encoder: ObjectEncoder[CarouselSlot] = deriveEncoder
}
