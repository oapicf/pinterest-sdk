package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BoardOwner
import org.openapitools.models.CreativeType
import org.openapitools.models.PinMedia

/**
 * Pin model containing properties related to a Pinterest Pin.
 * @param altUnderscoretext 
 * @param boardUnderscoreid The board to which this Pin belongs.
 * @param boardUnderscoreowner 
 * @param boardUnderscoresectionUnderscoreid The board section to which this Pin belongs.
 * @param createdUnderscoreat 
 * @param creativeUnderscoretype 
 * @param description 
 * @param dominantUnderscorecolor Dominant pin color. Hex number, e.g. `#6E7874`.
 * @param hasUnderscorebeenUnderscorepromoted Whether the Pin has been promoted or not.
 * @param id 
 * @param isUnderscoreowner Whether the \"operation user_account\" is the Pin owner.
 * @param isUnderscorestandard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
 * @param link 
 * @param media 
 * @param parentUnderscorepinUnderscoreid The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @param pinUnderscoremetrics Pin metrics with associated time intervals if any.
 * @param title 
 */
case class Pin(altUnderscoretext: Option[String],
                boardUnderscoreid: Option[String],
                boardUnderscoreowner: Option[BoardOwner],
                boardUnderscoresectionUnderscoreid: Option[String],
                createdUnderscoreat: Option[ZonedDateTime],
                creativeUnderscoretype: Option[CreativeType],
                description: Option[String],
                dominantUnderscorecolor: Option[String],
                hasUnderscorebeenUnderscorepromoted: Option[Boolean],
                id: String,
                isUnderscoreowner: Option[Boolean],
                isUnderscorestandard: Option[Boolean],
                link: Option[String],
                media: Option[PinMedia],
                parentUnderscorepinUnderscoreid: Option[String],
                pinUnderscoremetrics: Option[Object],
                title: Option[String]
                )

object Pin {
    /**
     * Creates the codec for converting Pin from and to JSON.
     */
    implicit val decoder: Decoder[Pin] = deriveDecoder
    implicit val encoder: ObjectEncoder[Pin] = deriveEncoder
}
