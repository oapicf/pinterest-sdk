package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * <p><= 2000 characters</p> <p>The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
 */
case class ItemAttributesRequestAllOfImageLink()

object ItemAttributesRequestAllOfImageLink {
    /**
     * Creates the codec for converting ItemAttributesRequestAllOfImageLink from and to JSON.
     */
    implicit val decoder: Decoder[ItemAttributesRequestAllOfImageLink] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemAttributesRequestAllOfImageLink] = deriveEncoder
}
