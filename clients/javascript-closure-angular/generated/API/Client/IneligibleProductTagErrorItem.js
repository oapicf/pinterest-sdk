goog.provide('API.Client.IneligibleProductTagErrorItem');

/**
 * Error item for a product tag that failed eligibility check.
 * @record
 */
API.Client.IneligibleProductTagErrorItem = function() {}

/**
 * Reason why the pin is ineligible for tagging.
 * @type {!API.Client.IneligibleProductTagReason}
 * @export
 */
API.Client.IneligibleProductTagErrorItem.prototype.errorMessage;

/**
 * Pin ID that failed eligibility check.
 * @type {!string}
 * @export
 */
API.Client.IneligibleProductTagErrorItem.prototype.pinId;

