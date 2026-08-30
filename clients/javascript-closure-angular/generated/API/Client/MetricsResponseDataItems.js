goog.provide('API.Client.MetricsResponseDataItems');

/**
 * @record
 */
API.Client.MetricsResponseDataItems = function() {}

/**
 * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
 * @type {!API.Client.Object}
 * @export
 */
API.Client.MetricsResponseDataItems.prototype.metrics;

/**
 * The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
 * @type {!string}
 * @export
 */
API.Client.MetricsResponseDataItems.prototype.targetingType;

/**
 * The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
 * @type {!string}
 * @export
 */
API.Client.MetricsResponseDataItems.prototype.targetingValue;

