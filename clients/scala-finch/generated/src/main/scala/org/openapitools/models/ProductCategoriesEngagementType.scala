package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class ProductCategoriesEngagementType()

object ProductCategoriesEngagementType {
    /**
     * Creates the codec for converting ProductCategoriesEngagementType from and to JSON.
     */
    implicit val decoder: Decoder[ProductCategoriesEngagementType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductCategoriesEngagementType] = deriveEncoder
}
