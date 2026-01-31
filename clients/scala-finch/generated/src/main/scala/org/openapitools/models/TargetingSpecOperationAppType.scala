package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TargetingSpecAppType
import scala.collection.immutable.Seq

/**
 * 
 * @param field 
 * @param operation 
 * @param values 
 */
case class TargetingSpecOperationAppType(field: String,
                operation: String,
                values: Seq[TargetingSpecAppType]
                )

object TargetingSpecOperationAppType {
    /**
     * Creates the codec for converting TargetingSpecOperationAppType from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecOperationAppType] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecOperationAppType] = deriveEncoder
}
