package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdPreviewCreateFromImage
import org.openapitools.models.AdPreviewCreateFromPin

/**
 * 
 * @param imageUnderscoreurl Image URL.
 * @param title Title displayed below ad.
 * @param pinUnderscoreid Pin ID.
 */
case class AdPreviewRequest(imageUnderscoreurl: String,
                title: String,
                pinUnderscoreid: String
                )

object AdPreviewRequest {
    /**
     * Creates the codec for converting AdPreviewRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdPreviewRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdPreviewRequest] = deriveEncoder
}
