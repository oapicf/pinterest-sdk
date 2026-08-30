package org.openapitools.server.model


/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 *
 * @param itemId Catalog item id in the merchant namespace for example: ''item_id_1''
 * @param storeCode Store code for the local inventory item for example: ''store_1''
*/
final case class ItemIdStoreCodePair (
  itemId: String,
  storeCode: String
)

