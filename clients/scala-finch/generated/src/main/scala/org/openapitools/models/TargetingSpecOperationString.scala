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
case class TargetingSpecOperationString(field: String,
                operation: String,
                value: String
                )

object TargetingSpecOperationString {
    /**
     * Creates the codec for converting TargetingSpecOperationString from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecOperationString] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecOperationString] = deriveEncoder
}
