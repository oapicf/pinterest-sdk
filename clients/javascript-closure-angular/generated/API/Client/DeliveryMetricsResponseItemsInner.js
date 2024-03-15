goog.provide('API.Client.DeliveryMetricsResponse_items_inner');

/**
 * @record
 */
API.Client.DeliveryMetricsResponseItemsInner = function() {}

/**
 * Metric's name.
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsInner.prototype.name;

/**
 * Category name
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsInner.prototype.category;

/**
 * How the metric is defined.
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsInner.prototype.definition;

/**
 * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsInner.prototype.displayName;

/** @enum {string} */
API.Client.DeliveryMetricsResponseItemsInner.CategoryEnum = { 
  ADS: 'ADS',
  ORGANIC: 'ORGANIC',
}
