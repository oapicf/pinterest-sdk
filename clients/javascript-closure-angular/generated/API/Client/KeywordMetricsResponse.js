goog.provide('API.Client.KeywordMetricsResponse');

/**
 * @record
 */
API.Client.KeywordMetricsResponse = function() {}

/**
 * Keyword name, e.g., \"keyword\":\"fashion outfits\"
 * @type {!string}
 * @export
 */
API.Client.KeywordMetricsResponse.prototype.keyword;

/**
 * @type {!API.Client.KeywordMetrics}
 * @export
 */
API.Client.KeywordMetricsResponse.prototype.metrics;

