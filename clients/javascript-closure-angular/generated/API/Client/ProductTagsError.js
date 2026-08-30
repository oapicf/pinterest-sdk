goog.provide('API.Client.ProductTagsError');

/**
 * Error response for requests containing ineligible product tags.
 * @record
 */
API.Client.ProductTagsError = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ProductTagsError.prototype.code;

/**
 * Details about which product tags failed eligibility check.
 * @type {!API.Client.IneligibleProductTagsErrorDetails}
 * @export
 */
API.Client.ProductTagsError.prototype.details;

/**
 * @type {!string}
 * @export
 */
API.Client.ProductTagsError.prototype.message;

