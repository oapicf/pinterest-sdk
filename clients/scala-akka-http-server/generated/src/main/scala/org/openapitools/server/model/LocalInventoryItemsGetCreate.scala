package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param itemFilters Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. for example: ''null''
*/
final case class LocalInventoryItemsGetCreate (
  itemFilters: Seq[ItemIdStoreCodePair]
)

