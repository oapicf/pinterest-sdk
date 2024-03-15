goog.provide('API.Client.ProductGroupAnalyticsResponse_inner');

/**
 * @record
 */
API.Client.ProductGroupAnalyticsResponseInner = function() {}

/**
 * The ID of the product group that this metrics belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupAnalyticsResponseInner.prototype.PRODUCT_GROUP_ID;

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.ProductGroupAnalyticsResponseInner.prototype.DATE;

