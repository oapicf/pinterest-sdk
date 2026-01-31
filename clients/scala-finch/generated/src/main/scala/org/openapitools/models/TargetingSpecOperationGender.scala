package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TargetingSpecGender
import scala.collection.immutable.Seq

/**
 * 
 * @param field 
 * @param operation 
 * @param values 
 */
case class TargetingSpecOperationGender(field: String,
                operation: String,
                values: Seq[TargetingSpecGender]
                )

object TargetingSpecOperationGender {
    /**
     * Creates the codec for converting TargetingSpecOperationGender from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecOperationGender] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecOperationGender] = deriveEncoder
}
