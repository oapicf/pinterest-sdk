goog.provide('API.Client.TargetingSpec_SHOPPING_RETARGETING');

/**
 * @record
 */
API.Client.TargetingSpecSHOPPINGRETARGETING = function() {}

/**
 * Number of days ago to start lookback timeframe for dynamic retargeting
 * @type {!number}
 * @export
 */
API.Client.TargetingSpecSHOPPINGRETARGETING.prototype.lookbackWindow;

/**
 * Event types to target for dynamic retargeting
 * @type {!Array<!number>}
 * @export
 */
API.Client.TargetingSpecSHOPPINGRETARGETING.prototype.tagTypes;

/**
 * Number of days ago to stop lookback timeframe for dynamic retargeting
 * @type {!number}
 * @export
 */
API.Client.TargetingSpecSHOPPINGRETARGETING.prototype.exclusionWindow;

