goog.provide('API.Client.feeds_list_200_response');

/**
 * @record
 */
API.Client.FeedsList200Response = function() {}

/**
 * @type {!Array<!API.Client.CatalogsFeed>}
 * @export
 */
API.Client.FeedsList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.FeedsList200Response.prototype.bookmark;

