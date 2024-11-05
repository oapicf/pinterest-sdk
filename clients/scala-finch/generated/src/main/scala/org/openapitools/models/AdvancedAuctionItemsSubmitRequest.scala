package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvancedAuctionItemsSubmitRecord
import scala.collection.immutable.Seq

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 * @param catalogUnderscoreid Catalog id pertaining to all items
 * @param items Array of item bid option operations
 */
case class AdvancedAuctionItemsSubmitRequest(catalogUnderscoreid: String,
                items: Seq[AdvancedAuctionItemsSubmitRecord]
                )

object AdvancedAuctionItemsSubmitRequest {
    /**
     * Creates the codec for converting AdvancedAuctionItemsSubmitRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItemsSubmitRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItemsSubmitRequest] = deriveEncoder
}
