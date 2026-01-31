package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Country
import org.openapitools.models.Language

/**
 * Object uniquely identifying a retail catalog item
 * @param country 
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param language 
 */
case class AdvancedAuctionItemsGetRecord(country: Country,
                itemUnderscoreid: String,
                language: Language
                )

object AdvancedAuctionItemsGetRecord {
    /**
     * Creates the codec for converting AdvancedAuctionItemsGetRecord from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItemsGetRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItemsGetRecord] = deriveEncoder
}
