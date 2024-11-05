package org.openapitools.server.model


/**
 * Request object used to get bid options values for a batch of retail catalog items
 *
 * @param catalogId Catalog id pertaining to the retail item for example: ''2680059592705''
 * @param items A list of retail catalog items to fetch bid options for for example: ''null''
*/
final case class AdvancedAuctionItemsGetRequest (
  catalogId: String,
  items: Seq[AdvancedAuctionItemsGetRecord]
)

