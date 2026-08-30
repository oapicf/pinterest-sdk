goog.provide('API.Client.DeliveryMetricsResponseItemsItems');

/**
 * @record
 */
API.Client.DeliveryMetricsResponseItemsItems = function() {}

/**
 * Category name
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsItems.prototype.category;

/**
 * How the metric is defined.
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsItems.prototype.definition;

/**
 * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsItems.prototype.displayName;

/**
 * Metric's name.
 * @type {!string}
 * @export
 */
API.Client.DeliveryMetricsResponseItemsItems.prototype.name;

/** @enum {string} */
API.Client.DeliveryMetricsResponseItemsItems.CategoryEnum = { 
  ADS: 'ADS',
  ORGANIC: 'ORGANIC',
}
