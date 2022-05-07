package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The counts can be null early in the process.
 * @param original The number of products in the feed file
 */
case class CatalogsFeedProductCounts(original: Option[Int]
                )

object CatalogsFeedProductCounts {
    /**
     * Creates the codec for converting CatalogsFeedProductCounts from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedProductCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedProductCounts] = deriveEncoder
}
