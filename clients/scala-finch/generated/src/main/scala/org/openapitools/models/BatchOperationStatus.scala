package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The status of the operation performed by the batch
 */
case class BatchOperationStatus()

object BatchOperationStatus {
    /**
     * Creates the codec for converting BatchOperationStatus from and to JSON.
     */
    implicit val decoder: Decoder[BatchOperationStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchOperationStatus] = deriveEncoder
}
