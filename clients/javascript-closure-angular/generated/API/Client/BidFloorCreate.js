goog.provide('API.Client.BidFloorCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.BidFloorCreate = function() {}

/**
 * List of bid floor specifications.
 * @type {!Array<!API.Client.BidFloorSpec>}
 * @export
 */
API.Client.BidFloorCreate.prototype.bidFloorSpecs;

/**
 * Ad group targeting specification defining the ad group target audience.
 * @type {!API.Client.TargetingSpecOptimal}
 * @export
 */
API.Client.BidFloorCreate.prototype.targetingSpec;

