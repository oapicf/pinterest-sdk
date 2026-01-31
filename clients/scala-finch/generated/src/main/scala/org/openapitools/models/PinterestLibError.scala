package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Default error response
 * @param code 
 * @param message 
 */
case class PinterestLibError(code: Int,
                message: String
                )

object PinterestLibError {
    /**
     * Creates the codec for converting PinterestLibError from and to JSON.
     */
    implicit val decoder: Decoder[PinterestLibError] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinterestLibError] = deriveEncoder
}
