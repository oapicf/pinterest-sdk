package org.openapitools.server.model


/**
 * Response object containing item bid options
 *
 * @param catalogId Response object of item bid options for example: ''2680059592705''
 * @param items Array with item bid options for example: ''null''
*/
final case class AdvancedAuctionItems (
  catalogId: Option[String] = None,
  items: Option[Seq[AdvancedAuctionItem]] = None
)

