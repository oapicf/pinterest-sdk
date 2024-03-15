package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class BulkUpsertStatus()

object BulkUpsertStatus {
    /**
     * Creates the codec for converting BulkUpsertStatus from and to JSON.
     */
    implicit val decoder: Decoder[BulkUpsertStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkUpsertStatus] = deriveEncoder
}
