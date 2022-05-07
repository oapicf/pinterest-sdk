package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Image URL-based media source
 * @param sourceUnderscoretype 
 * @param url 
 */
case class PinMediaSourceImageURL(sourceUnderscoretype: String,
                url: String
                )

object PinMediaSourceImageURL {
    /**
     * Creates the codec for converting PinMediaSourceImageURL from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImageURL] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImageURL] = deriveEncoder
}
