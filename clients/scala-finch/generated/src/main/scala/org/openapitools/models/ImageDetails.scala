package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param width 
 * @param height 
 * @param url 
 */
case class ImageDetails(width: Int,
                height: Int,
                url: String
                )

object ImageDetails {
    /**
     * Creates the codec for converting ImageDetails from and to JSON.
     */
    implicit val decoder: Decoder[ImageDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImageDetails] = deriveEncoder
}
