package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BoardOwner
import org.openapitools.models.PinMedia
import org.openapitools.models.PinMediaSource

/**
 * Pin
 * @param id 
 * @param createdUnderscoreat 
 * @param link 
 * @param title 
 * @param description 
 * @param altUnderscoretext 
 * @param boardUnderscoreid The board to which this Pin belongs.
 * @param boardUnderscoresectionUnderscoreid The board section to which this Pin belongs.
 * @param boardUnderscoreowner 
 * @param media 
 * @param mediaUnderscoresource 
 */
case class Pin(id: Option[String],
                createdUnderscoreat: Option[ZonedDateTime],
                link: Option[String],
                title: Option[String],
                description: Option[String],
                altUnderscoretext: Option[String],
                boardUnderscoreid: Option[String],
                boardUnderscoresectionUnderscoreid: Option[String],
                boardUnderscoreowner: Option[BoardOwner],
                media: Option[PinMedia],
                mediaUnderscoresource: Option[PinMediaSource]
                )

object Pin {
    /**
     * Creates the codec for converting Pin from and to JSON.
     */
    implicit val decoder: Decoder[Pin] = deriveDecoder
    implicit val encoder: ObjectEncoder[Pin] = deriveEncoder
}
