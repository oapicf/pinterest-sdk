package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param url 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
 */
case class AdPreviewURLResponse(url: Option[String]
                )

object AdPreviewURLResponse {
    /**
     * Creates the codec for converting AdPreviewURLResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdPreviewURLResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdPreviewURLResponse] = deriveEncoder
}
