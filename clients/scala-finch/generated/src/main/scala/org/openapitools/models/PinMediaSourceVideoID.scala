package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ContentType

/**
 * Video ID-based media source.
 * @param coverUnderscoreimageUnderscorecontentUnderscoretype Content type for cover image Base64.
 * @param coverUnderscoreimageUnderscoredata Cover image Base64.
 * @param coverUnderscoreimageUnderscorekeyUnderscoreframeUnderscoretime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
 * @param coverUnderscoreimageUnderscoreurl Cover image URL.
 * @param isUnderscorestandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @param mediaUnderscoreid 
 * @param sourceUnderscoretype 
 */
case class PinMediaSourceVideoID(coverUnderscoreimageUnderscorecontentUnderscoretype: Option[ContentType],
                coverUnderscoreimageUnderscoredata: Option[String],
                coverUnderscoreimageUnderscorekeyUnderscoreframeUnderscoretime: Option[Int],
                coverUnderscoreimageUnderscoreurl: Option[String],
                isUnderscorestandard: Option[Boolean],
                mediaUnderscoreid: String,
                sourceUnderscoretype: String
                )

object PinMediaSourceVideoID {
    /**
     * Creates the codec for converting PinMediaSourceVideoID from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceVideoID] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceVideoID] = deriveEncoder
}
