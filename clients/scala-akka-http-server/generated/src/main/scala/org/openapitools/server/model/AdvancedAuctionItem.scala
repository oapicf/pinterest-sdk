package org.openapitools.server.model


/**
 * = Advanced Auction Item =
 *
 * @param country  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param language  for example: ''null''
 * @param bidOptions  for example: ''null''
*/
final case class AdvancedAuctionItem (
  country: Country,
  itemId: String,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions
)

