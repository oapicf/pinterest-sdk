package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaSourceImagesURLItemsInner
import scala.collection.immutable.Seq

/**
 * Multiple images urls-based media source
 * @param sourceUnderscoretype 
 * @param items Array with image objects.
 * @param index 
 */
case class PinMediaSourceImagesURL(sourceUnderscoretype: Option[String],
                items: Seq[PinMediaSourceImagesURLItemsInner],
                index: Option[Int]
                )

object PinMediaSourceImagesURL {
    /**
     * Creates the codec for converting PinMediaSourceImagesURL from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesURL] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesURL] = deriveEncoder
}
