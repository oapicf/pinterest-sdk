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
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param country 
 * @param language 
 */
case class AdvancedAuctionKey(itemUnderscoreid: String,
                country: Country,
                language: Language
                )

object AdvancedAuctionKey {
    /**
     * Creates the codec for converting AdvancedAuctionKey from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionKey] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionKey] = deriveEncoder
}
