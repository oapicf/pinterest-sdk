package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageDetails

/**
 * 
 * @param 150x150 
 * @param 400x300 
 * @param 600x 
 * @param 1200x 
 */
case class ImageMetadataImages(150x150: Option[ImageDetails],
                400x300: Option[ImageDetails],
                600x: Option[ImageDetails],
                1200x: Option[ImageDetails]
                )

object ImageMetadataImages {
    /**
     * Creates the codec for converting ImageMetadataImages from and to JSON.
     */
    implicit val decoder: Decoder[ImageMetadataImages] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImageMetadataImages] = deriveEncoder
}
