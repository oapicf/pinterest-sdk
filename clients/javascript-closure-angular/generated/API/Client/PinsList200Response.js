goog.provide('API.Client.pins_list_200_response');

/**
 * @record
 */
API.Client.PinsList200Response = function() {}

/**
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.PinsList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.PinsList200Response.prototype.bookmark;

