goog.provide('API.Client.CartingProduct');

/**
 * @record
 */
API.Client.CartingProduct = function() {}

/**
 * the internal Pinterest carting product id (different from industry product id)
 * @type {!string}
 * @export
 */
API.Client.CartingProduct.prototype.cartingProductId;

/**
 * Whether to display only the preferred retailers for the carting product
 * @type {!boolean}
 * @export
 */
API.Client.CartingProduct.prototype.displayPreferredRetailersOnly;

/**
 * Whether to display the price for the carting product
 * @type {!boolean}
 * @export
 */
API.Client.CartingProduct.prototype.displayProductPrice;

/**
 * A sorted array of preferred retailers for the carting product
 * @type {!Array<!API.Client.CartingRetailer>}
 * @export
 */
API.Client.CartingProduct.prototype.preferredRetailers;

/**
 * Whether to randomize preferred retailers for the carting product
 * @type {!boolean}
 * @export
 */
API.Client.CartingProduct.prototype.randomizePreferredRetailers;

