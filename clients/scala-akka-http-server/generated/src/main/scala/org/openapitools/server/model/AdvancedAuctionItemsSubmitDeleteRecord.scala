package org.openapitools.server.model


/**
 * Object describing an item bid option deletion operation
 *
 * @param country  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param language  for example: ''null''
 * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. for example: ''null''
*/
final case class AdvancedAuctionItemsSubmitDeleteRecord (
  country: Country,
  itemId: String,
  language: Language,
  errors: Option[Seq[AdvancedAuctionOperationError]] = None
)

