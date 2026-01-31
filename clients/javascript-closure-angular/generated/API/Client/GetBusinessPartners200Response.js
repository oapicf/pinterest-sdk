goog.provide('API.Client.get_business_partners_200_response');

/**
 * @record
 */
API.Client.GetBusinessPartners200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.GetBusinessPartners200Response.prototype.bookmark;

/**
 * List of business partners.
 * @type {!Array<!API.Client.UserBusinessRoleBinding>}
 * @export
 */
API.Client.GetBusinessPartners200Response.prototype.items;

