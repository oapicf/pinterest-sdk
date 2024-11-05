package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class AdvancedAuctionOperation()

object AdvancedAuctionOperation {
    /**
     * Creates the codec for converting AdvancedAuctionOperation from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionOperation] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionOperation] = deriveEncoder
}
