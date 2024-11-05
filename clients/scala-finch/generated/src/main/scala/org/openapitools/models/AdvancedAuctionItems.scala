package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdvancedAuctionItem
import scala.collection.immutable.Seq

/**
 * Response object containing item bid options
 * @param catalogUnderscoreid Response object of item bid options
 * @param items Array with item bid options
 */
case class AdvancedAuctionItems(catalogUnderscoreid: Option[String],
                items: Option[Seq[AdvancedAuctionItem]]
                )

object AdvancedAuctionItems {
    /**
     * Creates the codec for converting AdvancedAuctionItems from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionItems] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionItems] = deriveEncoder
}
