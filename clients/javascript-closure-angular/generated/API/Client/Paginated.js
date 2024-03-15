goog.provide('API.Client.Paginated');

/**
 * @record
 */
API.Client.Paginated = function() {}

/**
 * @type {!Array<!API.Client.Object>}
 * @export
 */
API.Client.Paginated.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.Paginated.prototype.bookmark;

