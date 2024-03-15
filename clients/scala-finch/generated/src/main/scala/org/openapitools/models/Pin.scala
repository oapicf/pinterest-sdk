package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BoardOwner
import org.openapitools.models.CreativeType
import org.openapitools.models.PinMediaSource
import org.openapitools.models.SummaryPinMedia

/**
 * Pin
 * @param id 
 * @param createdUnderscoreat 
 * @param link 
 * @param title 
 * @param description 
 * @param dominantUnderscorecolor Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
 * @param altUnderscoretext 
 * @param creativeUnderscoretype 
 * @param boardUnderscoreid The board to which this Pin belongs.
 * @param boardUnderscoresectionUnderscoreid The board section to which this Pin belongs.
 * @param boardUnderscoreowner 
 * @param isUnderscoreowner Whether the \"operation user_account\" is the Pin owner.
 * @param media 
 * @param mediaUnderscoresource 
 * @param parentUnderscorepinUnderscoreid The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
 * @param isUnderscorestandard Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.
 * @param hasUnderscorebeenUnderscorepromoted Whether the Pin has been promoted or not.
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 * @param pinUnderscoremetrics Pin metrics with associated time intervals if any.
 */
case class Pin(id: Option[String],
                createdUnderscoreat: Option[ZonedDateTime],
                link: Option[String],
                title: Option[String],
                description: Option[String],
                dominantUnderscorecolor: Option[String],
                altUnderscoretext: Option[String],
                creativeUnderscoretype: Option[CreativeType],
                boardUnderscoreid: Option[String],
                boardUnderscoresectionUnderscoreid: Option[String],
                boardUnderscoreowner: Option[BoardOwner],
                isUnderscoreowner: Option[Boolean],
                media: Option[SummaryPinMedia],
                mediaUnderscoresource: Option[PinMediaSource],
                parentUnderscorepinUnderscoreid: Option[String],
                isUnderscorestandard: Option[Boolean],
                hasUnderscorebeenUnderscorepromoted: Option[Boolean],
                note: Option[String],
                pinUnderscoremetrics: Option[Object]
                )

object Pin {
    /**
     * Creates the codec for converting Pin from and to JSON.
     */
    implicit val decoder: Decoder[Pin] = deriveDecoder
    implicit val encoder: ObjectEncoder[Pin] = deriveEncoder
}
