package org.openapitools.server.model


/**
 * Error which occurred when applying a bid options operation to a specific item.
 *
 * @param code The error code for the item bid option operation validation error for example: ''6''
 * @param message Message describing the item bid option operation validation error for example: ''Bid in micro currency should be non-negative''
*/
final case class AdvancedAuctionOperationError (
  code: Option[Int] = None,
  message: Option[String] = None
)

