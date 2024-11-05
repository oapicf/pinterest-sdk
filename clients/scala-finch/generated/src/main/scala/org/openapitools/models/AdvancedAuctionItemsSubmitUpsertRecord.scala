package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvancedAuctionBidOptions
import org.openapitools.models.Country
import org.openapitools.models.Language
import org.openapitools.models.UpdateMaskBidOptionField
import scala.collection.immutable.Seq

/**
 * Object describing an item bid option upsert operation
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param country 
 * @param language 
 * @param bidUnderscoreoptions 
 * @param updateUnderscoremask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
 */
case class AdvancedAuctionItemsSubmitUpsertRecord(itemUnderscoreid: String,
                country: Country,
                language: Language,
                bidUnderscoreoptions: AdvancedAuctionBidOptions,
                updateUnderscoremask: Seq[UpdateMaskBidOptionField]
                )

object AdvancedAuctionItemsSubmitUpsertRecord {
    /**
     * Creates the codec for converting AdvancedAuctionItemsSubmitUpsertRecord from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItemsSubmitUpsertRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItemsSubmitUpsertRecord] = deriveEncoder
}
