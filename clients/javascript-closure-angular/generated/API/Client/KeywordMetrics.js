goog.provide('API.Client.KeywordMetrics');

/**
 * Keyword metrics JSON
 * @record
 */
API.Client.KeywordMetrics = function() {}

/**
 * Average cost per click
 * @type {!number}
 * @export
 */
API.Client.KeywordMetrics.prototype.avgCpcInMicroCurrency;

/**
 * Keyword's search frequency. This value is based on keyword frequency in pepsi client response
 * @type {!string}
 * @export
 */
API.Client.KeywordMetrics.prototype.keywordQueryVolume;

