package org.openapitools.server.model


/**
 * An item to be created
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsCreateRetailItem (
  itemId: String,
  operation: String,
  attributes: ItemAttributesRequest
)

