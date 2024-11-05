goog.provide('API.Client.DeletePartnersResponse');

/**
 * An object with a list of partners that were deleted.
 * @record
 */
API.Client.DeletePartnersResponse = function() {}

/**
 * List of partners whose business partnership have been terminated.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeletePartnersResponse.prototype.deletedPartners;

