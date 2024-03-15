package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param imageUnderscoreurl Image URL.
 * @param title Title displayed below ad.
 */
case class AdPreviewCreateFromImage(imageUnderscoreurl: String,
                title: String
                )

object AdPreviewCreateFromImage {
    /**
     * Creates the codec for converting AdPreviewCreateFromImage from and to JSON.
     */
    implicit val decoder: Decoder[AdPreviewCreateFromImage] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdPreviewCreateFromImage] = deriveEncoder
}
