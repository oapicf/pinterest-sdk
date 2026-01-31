package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaSourceImagesBase64Item
import scala.collection.immutable.Seq

/**
 * Multiple Base64-based images media source
 * @param index 
 * @param items Array with image objects.
 * @param sourceUnderscoretype The source type of the media.
 */
case class PinMediaSourceImagesBase64(index: Option[Int],
                items: Seq[PinMediaSourceImagesBase64Item],
                sourceUnderscoretype: String
                )

object PinMediaSourceImagesBase64 {
    /**
     * Creates the codec for converting PinMediaSourceImagesBase64 from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesBase64] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesBase64] = deriveEncoder
}
