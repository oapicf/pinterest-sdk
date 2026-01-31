goog.provide('API.Client.BidFloorSpec');

/**
 * @record
 */
API.Client.BidFloorSpec = function() {}

/**
 * @type {!API.Client.ActionType}
 * @export
 */
API.Client.BidFloorSpec.prototype.billableEvent;

/**
 * @type {!Array<!API.Client.Country>}
 * @export
 */
API.Client.BidFloorSpec.prototype.countries;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.BidFloorSpec.prototype.creativeType;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.BidFloorSpec.prototype.currency;

/**
 * @type {!API.Client.ObjectiveType}
 * @export
 */
API.Client.BidFloorSpec.prototype.objectiveType;

/**
 * @type {!API.Client.OptimizationGoalMetadata}
 * @export
 */
API.Client.BidFloorSpec.prototype.optimizationGoalMetadata;

