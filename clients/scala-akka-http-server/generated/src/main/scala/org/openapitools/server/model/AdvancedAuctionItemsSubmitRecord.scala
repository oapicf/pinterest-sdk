package org.openapitools.server.model


/**
 * Object describing an item bid option operation
 *
 * @param operation  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param bidOptions  for example: ''null''
 * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. for example: ''[BID, APP_TYPE_BID_MULTIPLIER_SET]''
*/
final case class AdvancedAuctionItemsSubmitRecord (
  operation: AdvancedAuctionOperation,
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions,
  updateMask: Seq[UpdateMaskBidOptionField]
)

