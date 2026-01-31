goog.provide('API.Client.TargetingSpecShoppingRetargeting');

/**
 * @record
 */
API.Client.TargetingSpecShoppingRetargeting = function() {}

/**
 * Number of days ago to stop lookback timeframe for dynamic retargeting
 * @type {!number}
 * @export
 */
API.Client.TargetingSpecShoppingRetargeting.prototype.exclusionWindow;

/**
 * Number of days ago to start lookback timeframe for dynamic retargeting
 * @type {!number}
 * @export
 */
API.Client.TargetingSpecShoppingRetargeting.prototype.lookbackWindow;

/**
 * Event types to target for dynamic retargeting
 * @type {!Array<!number>}
 * @export
 */
API.Client.TargetingSpecShoppingRetargeting.prototype.tagTypes;

