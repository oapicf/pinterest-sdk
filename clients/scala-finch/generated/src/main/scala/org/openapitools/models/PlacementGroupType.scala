package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Campaign placement group type
 */
case class PlacementGroupType()

object PlacementGroupType {
    /**
     * Creates the codec for converting PlacementGroupType from and to JSON.
     */
    implicit val decoder: Decoder[PlacementGroupType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlacementGroupType] = deriveEncoder
}
