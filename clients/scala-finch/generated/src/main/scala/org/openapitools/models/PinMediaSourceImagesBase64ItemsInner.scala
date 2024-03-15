package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param title 
 * @param description 
 * @param link Destination link for the image.
 * @param contentUnderscoretype 
 * @param data Image to upload as base64 string.
 */
case class PinMediaSourceImagesBase64ItemsInner(title: Option[String],
                description: Option[String],
                link: Option[String],
                contentUnderscoretype: String,
                data: String
                )

object PinMediaSourceImagesBase64ItemsInner {
    /**
     * Creates the codec for converting PinMediaSourceImagesBase64ItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesBase64ItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesBase64ItemsInner] = deriveEncoder
}
