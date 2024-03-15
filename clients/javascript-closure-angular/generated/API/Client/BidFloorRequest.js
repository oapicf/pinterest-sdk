goog.provide('API.Client.BidFloorRequest');

/**
 * @record
 */
API.Client.BidFloorRequest = function() {}

/**
 * @type {!Array<!API.Client.BidFloorSpec>}
 * @export
 */
API.Client.BidFloorRequest.prototype.bidFloorSpecs;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.BidFloorRequest.prototype.targetingSpec;

