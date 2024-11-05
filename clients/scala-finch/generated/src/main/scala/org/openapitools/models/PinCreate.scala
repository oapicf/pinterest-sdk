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
 * @param dominantUnderscorecolor Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
 * @param altUnderscoretext 
 * @param boardUnderscoreid The board to which this Pin belongs.
 * @param boardUnderscoresectionUnderscoreid The board section to which this Pin belongs.
 * @param boardUnderscoreowner 
 * @param media 
 * @param mediaUnderscoresource 
 * @param parentUnderscorepinUnderscoreid The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 */
case class PinCreate(id: Option[String],
                createdUnderscoreat: Option[ZonedDateTime],
                link: Option[String],
                title: Option[String],
                description: Option[String],
                dominantUnderscorecolor: Option[String],
                altUnderscoretext: Option[String],
                boardUnderscoreid: Option[String],
                boardUnderscoresectionUnderscoreid: Option[String],
                boardUnderscoreowner: Option[BoardOwner],
                media: Option[PinMedia],
                mediaUnderscoresource: Option[PinMediaSource],
                parentUnderscorepinUnderscoreid: Option[String],
                note: Option[String]
                )

object PinCreate {
    /**
     * Creates the codec for converting PinCreate from and to JSON.
     */
    implicit val decoder: Decoder[PinCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinCreate] = deriveEncoder
}
