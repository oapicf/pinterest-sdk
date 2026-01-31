package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ContentType

/**
 * Image Base64-based media source.
 * @param contentUnderscoretype 
 * @param data 
 * @param isUnderscorestandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @param sourceUnderscoretype The source type of the media.
 */
case class PinMediaSourceImageBase64(contentUnderscoretype: ContentType,
                data: String,
                isUnderscorestandard: Option[Boolean],
                sourceUnderscoretype: String
                )

object PinMediaSourceImageBase64 {
    /**
     * Creates the codec for converting PinMediaSourceImageBase64 from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImageBase64] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImageBase64] = deriveEncoder
}
