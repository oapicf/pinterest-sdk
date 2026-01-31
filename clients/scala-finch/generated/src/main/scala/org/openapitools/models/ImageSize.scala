package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageDetails

/**
 * 
 * @param 1200x 
 * @param 150x150 
 * @param 400x300 
 * @param 600x 
 */
case class ImageSize(1200x: Option[ImageDetails],
                150x150: Option[ImageDetails],
                400x300: Option[ImageDetails],
                600x: Option[ImageDetails]
                )

object ImageSize {
    /**
     * Creates the codec for converting ImageSize from and to JSON.
     */
    implicit val decoder: Decoder[ImageSize] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImageSize] = deriveEncoder
}
