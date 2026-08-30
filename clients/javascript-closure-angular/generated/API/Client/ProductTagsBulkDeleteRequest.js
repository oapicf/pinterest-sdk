goog.provide('API.Client.ProductTagsBulkDeleteRequest');

/**
 * Request body for bulk deleting product tags from a pin.
 * @record
 */
API.Client.ProductTagsBulkDeleteRequest = function() {}

/**
 * List of product tags to delete.
 * @type {!Array<!API.Client.ProductTagItem>}
 * @export
 */
API.Client.ProductTagsBulkDeleteRequest.prototype.productTags;

