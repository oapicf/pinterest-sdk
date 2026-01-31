package org.openapitools.server.model


/**
 * Object uniquely identifying a retail catalog item
 *
 * @param country  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param language  for example: ''null''
*/
final case class AdvancedAuctionKey (
  country: Country,
  itemId: String,
  language: Language
)

