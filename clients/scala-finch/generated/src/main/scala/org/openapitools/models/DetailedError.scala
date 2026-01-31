package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Used for including extra details to a base error
 * @param code 
 * @param details 
 * @param message 
 */
case class DetailedError(code: Int,
                details: Object,
                message: String
                )

object DetailedError {
    /**
     * Creates the codec for converting DetailedError from and to JSON.
     */
    implicit val decoder: Decoder[DetailedError] = deriveDecoder
    implicit val encoder: ObjectEncoder[DetailedError] = deriveEncoder
}
