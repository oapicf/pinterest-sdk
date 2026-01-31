package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param count Number of records with this error
 * @param errorUnderscorecode Numeric error code
 * @param message Error message description
 */
case class ErrorDetail(count: Int,
                errorUnderscorecode: Int,
                message: String
                )

object ErrorDetail {
    /**
     * Creates the codec for converting ErrorDetail from and to JSON.
     */
    implicit val decoder: Decoder[ErrorDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ErrorDetail] = deriveEncoder
}
