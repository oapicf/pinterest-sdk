package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param field 
 * @param operation 
 * @param value 
 */
case class TargetingSpecOperationMinMaxAge(field: String,
                operation: String,
                value: String
                )

object TargetingSpecOperationMinMaxAge {
    /**
     * Creates the codec for converting TargetingSpecOperationMinMaxAge from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecOperationMinMaxAge] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecOperationMinMaxAge] = deriveEncoder
}
