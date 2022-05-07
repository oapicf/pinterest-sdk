package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class CatalogsFeedProcessingStatus()

object CatalogsFeedProcessingStatus {
    /**
     * Creates the codec for converting CatalogsFeedProcessingStatus from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedProcessingStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedProcessingStatus] = deriveEncoder
}
