package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ContentType

/**
 * 
 * @param contentUnderscoretype 
 * @param data 
 * @param description 
 * @param link 
 * @param title 
 */
case class PinMediaSourceImagesBase64Item(contentUnderscoretype: ContentType,
                data: String,
                description: Option[String],
                link: Option[String],
                title: Option[String]
                )

object PinMediaSourceImagesBase64Item {
    /**
     * Creates the codec for converting PinMediaSourceImagesBase64Item from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesBase64Item] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesBase64Item] = deriveEncoder
}
