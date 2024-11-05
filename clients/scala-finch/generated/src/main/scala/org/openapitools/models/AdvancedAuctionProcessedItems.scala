package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvancedAuctionProcessedItem
import scala.collection.immutable.Seq

/**
 * Response object containing the results of an operation on an item bid option
 * @param catalogUnderscoreid Catalog id pertaining to all items
 * @param items Array of advanced auction processed items
 */
case class AdvancedAuctionProcessedItems(catalogUnderscoreid: Option[String],
                items: Option[Seq[AdvancedAuctionProcessedItem]]
                )

object AdvancedAuctionProcessedItems {
    /**
     * Creates the codec for converting AdvancedAuctionProcessedItems from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionProcessedItems] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionProcessedItems] = deriveEncoder
}
