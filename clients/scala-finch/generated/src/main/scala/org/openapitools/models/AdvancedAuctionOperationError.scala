package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Error which occurred when applying a bid options operation to a specific item.
 * @param code The error code for the item bid option operation validation error
 * @param message Message describing the item bid option operation validation error
 */
case class AdvancedAuctionOperationError(code: Option[Int],
                message: Option[String]
                )

object AdvancedAuctionOperationError {
    /**
     * Creates the codec for converting AdvancedAuctionOperationError from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionOperationError] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionOperationError] = deriveEncoder
}
