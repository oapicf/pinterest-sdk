package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinUpdateCarouselSlotsInner
import scala.collection.immutable.Seq

/**
 * Pin fields for updates
 * @param altUnderscoretext Pin's alternative text.
 * @param boardUnderscoreid The id of the board to move the Pin onto.
 * @param boardUnderscoresectionUnderscoreid <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
 * @param description Pin description - 800 characters maximum.
 * @param link URL viewer is taken to when they click pin.
 * @param title The native pin title that creators explicitly prefer to display.
 * @param carouselUnderscoreslots Carousel Pin slots data.
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 */
case class PinUpdate(altUnderscoretext: Option[String],
                boardUnderscoreid: Option[String],
                boardUnderscoresectionUnderscoreid: Option[String],
                description: Option[String],
                link: Option[String],
                title: Option[String],
                carouselUnderscoreslots: Option[Seq[PinUpdateCarouselSlotsInner]],
                note: Option[String]
                )

object PinUpdate {
    /**
     * Creates the codec for converting PinUpdate from and to JSON.
     */
    implicit val decoder: Decoder[PinUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinUpdate] = deriveEncoder
}
