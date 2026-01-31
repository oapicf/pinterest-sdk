package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CarouselSlot
import scala.collection.immutable.Seq

/**
 * Resource create or update operation model.
 * @param altUnderscoretext 
 * @param boardUnderscoreid The board to which this Pin belongs.
 * @param boardUnderscoresectionUnderscoreid The board section to which this Pin belongs.
 * @param carouselUnderscoreslots Carousel Pin slots data.
 * @param description 
 * @param link 
 * @param title 
 */
case class PinUpdate(altUnderscoretext: Option[String],
                boardUnderscoreid: Option[String],
                boardUnderscoresectionUnderscoreid: Option[String],
                carouselUnderscoreslots: Option[Seq[CarouselSlot]],
                description: Option[String],
                link: Option[String],
                title: Option[String]
                )

object PinUpdate {
    /**
     * Creates the codec for converting PinUpdate from and to JSON.
     */
    implicit val decoder: Decoder[PinUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinUpdate] = deriveEncoder
}
