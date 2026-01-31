package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaSourceImagesURLItem
import scala.collection.immutable.Seq

/**
 * Multiple URL-based images media source
 * @param index 
 * @param items Array with image objects.
 * @param sourceUnderscoretype The source type of the media.
 */
case class PinMediaSourceImagesURL(index: Option[Int],
                items: Seq[PinMediaSourceImagesURLItem],
                sourceUnderscoretype: String
                )

object PinMediaSourceImagesURL {
    /**
     * Creates the codec for converting PinMediaSourceImagesURL from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesURL] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesURL] = deriveEncoder
}
