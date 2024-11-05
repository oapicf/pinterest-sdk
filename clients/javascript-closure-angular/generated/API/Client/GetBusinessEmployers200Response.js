goog.provide('API.Client.get_business_employers_200_response');

/**
 * @record
 */
API.Client.GetBusinessEmployers200Response = function() {}

/**
 * List of employers.
 * @type {!Array<!API.Client.UserBusinessRoleBinding>}
 * @export
 */
API.Client.GetBusinessEmployers200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.GetBusinessEmployers200Response.prototype.bookmark;

