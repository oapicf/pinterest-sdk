package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TargetingSpecShoppingRetargeting
import scala.collection.immutable.Seq

/**
 * 
 * @param field 
 * @param operation 
 * @param values 
 */
case class TargetingSpecOperationShoppingRetargeting(field: String,
                operation: String,
                values: Seq[TargetingSpecShoppingRetargeting]
                )

object TargetingSpecOperationShoppingRetargeting {
    /**
     * Creates the codec for converting TargetingSpecOperationShoppingRetargeting from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecOperationShoppingRetargeting] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecOperationShoppingRetargeting] = deriveEncoder
}
