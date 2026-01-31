package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param field 
 * @param operation 
 * @param values 
 */
case class TargetingSpecOperationList(field: String,
                operation: String,
                values: Seq[String]
                )

object TargetingSpecOperationList {
    /**
     * Creates the codec for converting TargetingSpecOperationList from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecOperationList] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecOperationList] = deriveEncoder
}
