goog.provide('API.Client.media_list_200_response');

/**
 * @record
 */
API.Client.MediaList200Response = function() {}

/**
 * Media
 * @type {!Array<!API.Client.MediaUploadDetails>}
 * @export
 */
API.Client.MediaList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.MediaList200Response.prototype.bookmark;

