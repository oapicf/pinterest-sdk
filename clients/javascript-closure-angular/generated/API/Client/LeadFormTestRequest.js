goog.provide('API.Client.LeadFormTestRequest');

/**
 * Request to create test data for lead data test API.
 * @record
 */
API.Client.LeadFormTestRequest = function() {}

/**
 * Test lead answers. Should follow the creation order.
 * @type {!Array<!string>}
 * @export
 */
API.Client.LeadFormTestRequest.prototype.answers;

