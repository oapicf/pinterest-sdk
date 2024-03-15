package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
 */
case class BatchOperation()

object BatchOperation {
    /**
     * Creates the codec for converting BatchOperation from and to JSON.
     */
    implicit val decoder: Decoder[BatchOperation] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchOperation] = deriveEncoder
}
