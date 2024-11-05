package org.openapitools.server.model


/**
 * Object describing the result of an operation on an item bid option
 *
 * @param operation  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param bidOptions  for example: ''null''
 * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. for example: ''[BID, APP_TYPE_BID_MULTIPLIER_SET]''
 * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. for example: ''null''
*/
final case class AdvancedAuctionProcessedItem (
  operation: AdvancedAuctionOperation,
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions,
  updateMask: Seq[UpdateMaskBidOptionField],
  errors: Option[Seq[AdvancedAuctionOperationError]] = None
)

