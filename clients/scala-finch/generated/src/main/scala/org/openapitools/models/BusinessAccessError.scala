package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code 
 * @param message 
 */
case class BusinessAccessError(code: Int,
                message: String
                )

object BusinessAccessError {
    /**
     * Creates the codec for converting BusinessAccessError from and to JSON.
     */
    implicit val decoder: Decoder[BusinessAccessError] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessAccessError] = deriveEncoder
}
