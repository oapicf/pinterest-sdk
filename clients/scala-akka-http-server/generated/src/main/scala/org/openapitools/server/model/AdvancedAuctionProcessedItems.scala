package org.openapitools.server.model


/**
 * Response object containing the results of an operation on an item bid option
 *
 * @param catalogId Catalog id pertaining to all items for example: ''2680059592705''
 * @param items Array of advanced auction processed items for example: ''null''
*/
final case class AdvancedAuctionProcessedItems (
  catalogId: Option[String] = None,
  items: Option[Seq[AdvancedAuctionProcessedItem]] = None
)

