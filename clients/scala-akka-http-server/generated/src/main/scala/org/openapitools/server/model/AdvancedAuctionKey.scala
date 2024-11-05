package org.openapitools.server.model


/**
 * Object uniquely identifying a retail catalog item
 *
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
*/
final case class AdvancedAuctionKey (
  itemId: String,
  country: Country,
  language: Language
)

