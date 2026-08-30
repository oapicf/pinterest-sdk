goog.provide('API.Client.TrendingKeywordsResponse');

/**
 * @record
 */
API.Client.TrendingKeywordsResponse = function() {}

/**
 * The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.
 * @type {!Array<!API.Client.TrendingKeyword>}
 * @export
 */
API.Client.TrendingKeywordsResponse.prototype.trends;

