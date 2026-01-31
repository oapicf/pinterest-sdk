package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaSource

/**
 * Resource create operation model.
 * @param altUnderscoretext 
 * @param boardUnderscoreid The board to which this Pin belongs.
 * @param boardUnderscoresectionUnderscoreid The board section to which this Pin belongs.
 * @param description 
 * @param dominantUnderscorecolor Dominant pin color. Hex number, e.g. `#6E7874`.
 * @param link 
 * @param mediaUnderscoresource 
 * @param parentUnderscorepinUnderscoreid The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @param sponsorUnderscoreid The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
 * @param title 
 */
case class PinCreate(altUnderscoretext: Option[String],
                boardUnderscoreid: Option[String],
                boardUnderscoresectionUnderscoreid: Option[String],
                description: Option[String],
                dominantUnderscorecolor: Option[String],
                link: Option[String],
                mediaUnderscoresource: Option[PinMediaSource],
                parentUnderscorepinUnderscoreid: Option[String],
                sponsorUnderscoreid: Option[String],
                title: Option[String]
                )

object PinCreate {
    /**
     * Creates the codec for converting PinCreate from and to JSON.
     */
    implicit val decoder: Decoder[PinCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinCreate] = deriveEncoder
}
