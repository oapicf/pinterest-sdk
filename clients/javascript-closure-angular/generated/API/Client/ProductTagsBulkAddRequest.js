goog.provide('API.Client.ProductTagsBulkAddRequest');

/**
 * Request body for bulk adding product tags to a pin.
 * @record
 */
API.Client.ProductTagsBulkAddRequest = function() {}

/**
 * List of product tags to add. Maximum 24 items allowed.
 * @type {!Array<!API.Client.ProductTagItem>}
 * @export
 */
API.Client.ProductTagsBulkAddRequest.prototype.productTags;

