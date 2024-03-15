goog.provide('API.Client.boards_list_200_response');

/**
 * @record
 */
API.Client.BoardsList200Response = function() {}

/**
 * Boards
 * @type {!Array<!API.Client.Board>}
 * @export
 */
API.Client.BoardsList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardsList200Response.prototype.bookmark;

