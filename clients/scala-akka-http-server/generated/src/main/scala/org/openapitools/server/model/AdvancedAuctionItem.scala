package org.openapitools.server.model


/**
 * = Advanced Auction Item =
 *
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param bidOptions  for example: ''null''
*/
final case class AdvancedAuctionItem (
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions
)

