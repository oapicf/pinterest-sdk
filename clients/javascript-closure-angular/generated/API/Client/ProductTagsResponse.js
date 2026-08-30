goog.provide('API.Client.ProductTagsResponse');

/**
 * Response containing a list of product tags for a pin.
 * @record
 */
API.Client.ProductTagsResponse = function() {}

/**
 * List of product tags on the pin.
 * @type {!Array<!API.Client.ProductTagItem>}
 * @export
 */
API.Client.ProductTagsResponse.prototype.productTags;

