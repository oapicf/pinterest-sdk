package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * List of verticals for product categories.
 */
case class VerticalProductCategory()

object VerticalProductCategory {
    /**
     * Creates the codec for converting VerticalProductCategory from and to JSON.
     */
    implicit val decoder: Decoder[VerticalProductCategory] = deriveDecoder
    implicit val encoder: ObjectEncoder[VerticalProductCategory] = deriveEncoder
}
