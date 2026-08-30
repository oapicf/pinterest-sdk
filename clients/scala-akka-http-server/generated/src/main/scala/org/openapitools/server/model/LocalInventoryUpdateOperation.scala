package org.openapitools.server.model


/**
 * Update operation for local inventory item
 *
 * @param attributes  for example: ''null''
 * @param itemId Catalog item id in the merchant namespace for example: ''item_id_1''
 * @param operation  for example: ''null''
 * @param storeCode Store code for the local inventory item for example: ''store_1''
*/
final case class LocalInventoryUpdateOperation (
  attributes: RetailLocalInventoryItemAttributesOptional,
  itemId: String,
  operation: String,
  storeCode: String
)

