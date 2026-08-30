goog.provide('API.Client.ProductGroupAnalyticsItems');

/**
 * @record
 */
API.Client.ProductGroupAnalyticsItems = function() {}

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.ProductGroupAnalyticsItems.prototype.DATE;

/**
 * The ID of the product group that this metrics belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupAnalyticsItems.prototype.PRODUCT_GROUP_ID;

