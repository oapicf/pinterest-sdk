package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaSourceImagesBase64ItemsInner
import scala.collection.immutable.Seq

/**
 * Multiple Base64-encoded images media source
 * @param sourceUnderscoretype 
 * @param items Array with image objects.
 * @param index 
 */
case class PinMediaSourceImagesBase64(sourceUnderscoretype: Option[String],
                items: Seq[PinMediaSourceImagesBase64ItemsInner],
                index: Option[Int]
                )

object PinMediaSourceImagesBase64 {
    /**
     * Creates the codec for converting PinMediaSourceImagesBase64 from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesBase64] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesBase64] = deriveEncoder
}
