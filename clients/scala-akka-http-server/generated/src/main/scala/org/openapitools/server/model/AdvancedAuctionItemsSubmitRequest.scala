package org.openapitools.server.model


/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 *
 * @param catalogId Catalog id pertaining to all items for example: ''2680059592705''
 * @param items Array of item bid option operations for example: ''null''
*/
final case class AdvancedAuctionItemsSubmitRequest (
  catalogId: String,
  items: Seq[AdvancedAuctionItemsSubmitRecord]
)

