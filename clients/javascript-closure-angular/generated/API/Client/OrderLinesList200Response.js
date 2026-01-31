goog.provide('API.Client.order_lines_list_200_response');

/**
 * @record
 */
API.Client.OrderLinesList200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OrderLinesList200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.OrderLine>}
 * @export
 */
API.Client.OrderLinesList200Response.prototype.items;

