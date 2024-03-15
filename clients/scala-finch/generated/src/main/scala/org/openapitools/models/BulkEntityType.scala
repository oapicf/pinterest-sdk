package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Refers ads entity type
 */
case class BulkEntityType()

object BulkEntityType {
    /**
     * Creates the codec for converting BulkEntityType from and to JSON.
     */
    implicit val decoder: Decoder[BulkEntityType] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkEntityType] = deriveEncoder
}
