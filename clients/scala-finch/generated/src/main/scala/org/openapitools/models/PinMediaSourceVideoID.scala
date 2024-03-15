package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Video ID-based media source
 * @param sourceUnderscoretype 
 * @param coverUnderscoreimageUnderscoreurl Cover image url.
 * @param coverUnderscoreimageUnderscorecontentUnderscoretype Content type for cover image Base64.
 * @param coverUnderscoreimageUnderscoredata Cover image Base64.
 * @param mediaUnderscoreid 
 * @param isUnderscorestandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 */
case class PinMediaSourceVideoID(sourceUnderscoretype: String,
                coverUnderscoreimageUnderscoreurl: Option[String],
                coverUnderscoreimageUnderscorecontentUnderscoretype: Option[String],
                coverUnderscoreimageUnderscoredata: Option[String],
                mediaUnderscoreid: String,
                isUnderscorestandard: Option[Boolean]
                )

object PinMediaSourceVideoID {
    /**
     * Creates the codec for converting PinMediaSourceVideoID from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceVideoID] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceVideoID] = deriveEncoder
}
