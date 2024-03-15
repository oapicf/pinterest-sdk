goog.provide('API.Client.feed_processing_results_list_200_response');

/**
 * @record
 */
API.Client.FeedProcessingResultsList200Response = function() {}

/**
 * @type {!Array<!API.Client.CatalogsFeedProcessingResult>}
 * @export
 */
API.Client.FeedProcessingResultsList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.FeedProcessingResultsList200Response.prototype.bookmark;

