package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvancedAuctionItemsGetRecord
import scala.collection.immutable.Seq

/**
 * Request object used to get bid options values for a batch of retail catalog items
 * @param catalogUnderscoreid Catalog id pertaining to the retail item
 * @param items A list of retail catalog items to fetch bid options for
 */
case class AdvancedAuctionItemsGetRequest(catalogUnderscoreid: String,
                items: Seq[AdvancedAuctionItemsGetRecord]
                )

object AdvancedAuctionItemsGetRequest {
    /**
     * Creates the codec for converting AdvancedAuctionItemsGetRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItemsGetRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItemsGetRequest] = deriveEncoder
}
