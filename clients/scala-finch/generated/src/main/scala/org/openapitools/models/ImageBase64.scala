package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Base64-encoded image media source
 * @param contentUnderscoretype 
 * @param data 
 */
case class ImageBase64(contentUnderscoretype: String,
                data: String
                )

object ImageBase64 {
    /**
     * Creates the codec for converting ImageBase64 from and to JSON.
     */
    implicit val decoder: Decoder[ImageBase64] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImageBase64] = deriveEncoder
}
