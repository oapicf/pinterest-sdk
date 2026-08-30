goog.provide('API.Client.LocalInventoryItemsGetCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.LocalInventoryItemsGetCreate = function() {}

/**
 * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
 * @type {!Array<!API.Client.ItemIdStoreCodePair>}
 * @export
 */
API.Client.LocalInventoryItemsGetCreate.prototype.itemFilters;

