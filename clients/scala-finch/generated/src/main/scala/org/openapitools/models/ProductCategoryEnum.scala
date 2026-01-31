package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * List of product category details
 */
case class ProductCategoryEnum()

object ProductCategoryEnum {
    /**
     * Creates the codec for converting ProductCategoryEnum from and to JSON.
     */
    implicit val decoder: Decoder[ProductCategoryEnum] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductCategoryEnum] = deriveEncoder
}
