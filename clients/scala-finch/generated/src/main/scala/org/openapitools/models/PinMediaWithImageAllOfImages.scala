package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param 150x150 
 * @param 400x300 
 * @param 600x 
 * @param 1200x 
 */
case class PinMediaWithImageAllOfImages(150x150: Option[Object],
                400x300: Option[Object],
                600x: Option[Object],
                1200x: Option[Object]
                )

object PinMediaWithImageAllOfImages {
    /**
     * Creates the codec for converting PinMediaWithImageAllOfImages from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaWithImageAllOfImages] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaWithImageAllOfImages] = deriveEncoder
}
