package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Country
import org.openapitools.models.Language

/**
 * Object describing an item bid option deletion operation
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param country 
 * @param language 
 */
case class AdvancedAuctionItemsSubmitDeleteRecord(itemUnderscoreid: String,
                country: Country,
                language: Language
                )

object AdvancedAuctionItemsSubmitDeleteRecord {
    /**
     * Creates the codec for converting AdvancedAuctionItemsSubmitDeleteRecord from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItemsSubmitDeleteRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItemsSubmitDeleteRecord] = deriveEncoder
}
