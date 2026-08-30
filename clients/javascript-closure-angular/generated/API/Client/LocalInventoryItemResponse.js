goog.provide('API.Client.LocalInventoryItemResponse');

/**
 * Local inventory item response
 * @record
 */
API.Client.LocalInventoryItemResponse = function() {}

/**
 * Ad link for the item
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.adLink;

/**
 * Availability status of the item
 * @type {!API.Client.ItemAvailability}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.availability;

/**
 * The millisecond timestamp when the local inventory item was created
 * @type {!number}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.createdAt;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.itemId;

/**
 * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
 * @type {!number}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.lastUpdatedTime;

/**
 * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.price;

/**
 * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.salePrice;

/**
 * Store metadata for this local inventory item
 * @type {!API.Client.StoreMetadata}
 * @export
 */
API.Client.LocalInventoryItemResponse.prototype.storeMetadata;

