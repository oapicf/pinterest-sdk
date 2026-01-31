goog.provide('API.Client.boards_list_200_response');

/**
 * @record
 */
API.Client.BoardsList200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BoardsList200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.Board>}
 * @export
 */
API.Client.BoardsList200Response.prototype.items;

