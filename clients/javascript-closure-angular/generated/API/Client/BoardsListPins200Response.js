goog.provide('API.Client.boards_list_pins_200_response');

/**
 * @record
 */
API.Client.BoardsListPins200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BoardsListPins200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.PinRead>}
 * @export
 */
API.Client.BoardsListPins200Response.prototype.items;

