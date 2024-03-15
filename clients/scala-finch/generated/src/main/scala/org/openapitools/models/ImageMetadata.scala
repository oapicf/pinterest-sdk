package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageMetadataImages

/**
 * 
 * @param itemUnderscoretype 
 * @param title 
 * @param description 
 * @param link 
 * @param images 
 */
case class ImageMetadata(itemUnderscoretype: Option[String],
                title: Option[String],
                description: Option[String],
                link: Option[String],
                images: Option[ImageMetadataImages]
                )

object ImageMetadata {
    /**
     * Creates the codec for converting ImageMetadata from and to JSON.
     */
    implicit val decoder: Decoder[ImageMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImageMetadata] = deriveEncoder
}
