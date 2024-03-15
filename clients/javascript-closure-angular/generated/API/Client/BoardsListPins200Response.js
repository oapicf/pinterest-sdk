goog.provide('API.Client.boards_list_pins_200_response');

/**
 * @record
 */
API.Client.BoardsListPins200Response = function() {}

/**
 * Pins
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.BoardsListPins200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardsListPins200Response.prototype.bookmark;

