package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageSize

/**
 * 
 * @param description 
 * @param images 
 * @param itemUnderscoretype 
 * @param link 
 * @param title 
 */
case class ImageMetadata(description: Option[String],
                images: Option[ImageSize],
                itemUnderscoretype: Option[String],
                link: Option[String],
                title: Option[String]
                )

object ImageMetadata {
    /**
     * Creates the codec for converting ImageMetadata from and to JSON.
     */
    implicit val decoder: Decoder[ImageMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImageMetadata] = deriveEncoder
}
