package org.openapitools.server.model


/**
 * Object describing an item bid option deletion operation
 *
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
*/
final case class AdvancedAuctionItemsSubmitDeleteRecord (
  itemId: String,
  country: Country,
  language: Language
)

