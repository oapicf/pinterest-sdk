package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvancedAuctionBidOptions
import org.openapitools.models.Country
import org.openapitools.models.Language

/**
 * 
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param country 
 * @param language 
 * @param bidUnderscoreoptions 
 */
case class AdvancedAuctionItem(itemUnderscoreid: String,
                country: Country,
                language: Language,
                bidUnderscoreoptions: AdvancedAuctionBidOptions
                )

object AdvancedAuctionItem {
    /**
     * Creates the codec for converting AdvancedAuctionItem from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItem] = deriveEncoder
}
