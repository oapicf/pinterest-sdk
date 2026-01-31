package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvancedAuctionOperationError
import org.openapitools.models.Country
import org.openapitools.models.Language
import scala.collection.immutable.Seq

/**
 * Object describing an item bid option deletion operation
 * @param country 
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param language 
 * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
 */
case class AdvancedAuctionItemsSubmitDeleteRecord(country: Country,
                itemUnderscoreid: String,
                language: Language,
                errors: Option[Seq[AdvancedAuctionOperationError]]
                )

object AdvancedAuctionItemsSubmitDeleteRecord {
    /**
     * Creates the codec for converting AdvancedAuctionItemsSubmitDeleteRecord from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItemsSubmitDeleteRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItemsSubmitDeleteRecord] = deriveEncoder
}
