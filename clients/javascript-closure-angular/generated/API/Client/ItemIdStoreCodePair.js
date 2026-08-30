goog.provide('API.Client.ItemIdStoreCodePair');

/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 * @record
 */
API.Client.ItemIdStoreCodePair = function() {}

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemIdStoreCodePair.prototype.itemId;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.ItemIdStoreCodePair.prototype.storeCode;

