goog.provide('API.Client.board_sections_list_200_response');

/**
 * @record
 */
API.Client.BoardSectionsList200Response = function() {}

/**
 * Board sections
 * @type {!Array<!API.Client.BoardSection>}
 * @export
 */
API.Client.BoardSectionsList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardSectionsList200Response.prototype.bookmark;

