package org.openapitools.server.model


/**
 * @param cartingProductId the internal Pinterest carting product id (different from industry product id) for example: ''null''
 * @param displayPreferredRetailersOnly Whether to display only the preferred retailers for the carting product for example: ''null''
 * @param displayProductPrice Whether to display the price for the carting product for example: ''null''
 * @param preferredRetailers A sorted array of preferred retailers for the carting product for example: ''null''
 * @param randomizePreferredRetailers Whether to randomize preferred retailers for the carting product for example: ''null''
*/
final case class CartingProduct (
  cartingProductId: String,
  displayPreferredRetailersOnly: Option[Boolean] = None,
  displayProductPrice: Option[Boolean] = None,
  preferredRetailers: Option[Seq[CartingRetailer]] = None,
  randomizePreferredRetailers: Option[Boolean] = None
)

