goog.provide('API.Client.BidOptionsAgeBucketMultipliers');

/**
 * This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 * @record
 */
API.Client.BidOptionsAgeBucketMultipliers = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.BidOptionsAgeBucketMultipliers.prototype._1824;

/**
 * @type {!number}
 * @export
 */
API.Client.BidOptionsAgeBucketMultipliers.prototype._2534;

/**
 * @type {!number}
 * @export
 */
API.Client.BidOptionsAgeBucketMultipliers.prototype._3544;

/**
 * @type {!number}
 * @export
 */
API.Client.BidOptionsAgeBucketMultipliers.prototype._4549;

/**
 * @type {!number}
 * @export
 */
API.Client.BidOptionsAgeBucketMultipliers.prototype._5054;

/**
 * @type {!number}
 * @export
 */
API.Client.BidOptionsAgeBucketMultipliers.prototype._5564;

/**
 * @type {!number}
 * @export
 */
API.Client.BidOptionsAgeBucketMultipliers.prototype._65;

