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
 * @param url URL of image to upload.
 */
case class PinMediaSourceImagesURLItemsInner(title: Option[String],
                description: Option[String],
                link: Option[String],
                url: String
                )

object PinMediaSourceImagesURLItemsInner {
    /**
     * Creates the codec for converting PinMediaSourceImagesURLItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesURLItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesURLItemsInner] = deriveEncoder
}
