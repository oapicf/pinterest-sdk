package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImageDetails
import scala.collection.immutable.Seq

/**
 * 
 * @param images 
 */
case class PinMediaWithImageAllOf(images: Option[Map[String, ImageDetails]]
                )

object PinMediaWithImageAllOf {
    /**
     * Creates the codec for converting PinMediaWithImageAllOf from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImageAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImageAllOf] = deriveEncoder
}
