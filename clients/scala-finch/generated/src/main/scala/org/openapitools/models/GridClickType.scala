package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Where a user is taken after clicking on an ad in grid.
 */
case class GridClickType()

object GridClickType {
    /**
     * Creates the codec for converting GridClickType from and to JSON.
     */
    implicit val decoder: Decoder[GridClickType] = deriveDecoder
    implicit val encoder: ObjectEncoder[GridClickType] = deriveEncoder
}
