goog.provide('API.Client.RetailLocalInventoryItemAttributesOptional');

/**
 * Local inventory attributes for retail items (all fields optional for update/get)
 * @record
 */
API.Client.RetailLocalInventoryItemAttributesOptional = function() {}

/**
 * Ad link for the item
 * @type {!string}
 * @export
 */
API.Client.RetailLocalInventoryItemAttributesOptional.prototype.adLink;

/**
 * Availability status of the item
 * @type {!API.Client.ItemAvailability}
 * @export
 */
API.Client.RetailLocalInventoryItemAttributesOptional.prototype.availability;

/**
 * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
 * @type {!string}
 * @export
 */
API.Client.RetailLocalInventoryItemAttributesOptional.prototype.price;

/**
 * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 * @type {!string}
 * @export
 */
API.Client.RetailLocalInventoryItemAttributesOptional.prototype.salePrice;

