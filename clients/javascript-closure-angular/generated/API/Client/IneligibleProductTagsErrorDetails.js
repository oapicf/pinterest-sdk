goog.provide('API.Client.IneligibleProductTagsErrorDetails');

/**
 * Details about ineligible product tags in the request.
 * @record
 */
API.Client.IneligibleProductTagsErrorDetails = function() {}

/**
 * List of product tags that failed eligibility check.
 * @type {!Array<!API.Client.IneligibleProductTagErrorItem>}
 * @export
 */
API.Client.IneligibleProductTagsErrorDetails.prototype.productTags;

