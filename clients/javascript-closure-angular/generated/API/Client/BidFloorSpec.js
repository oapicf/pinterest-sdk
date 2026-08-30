goog.provide('API.Client.BidFloorSpec');

/**
 * Bid floor specification for a given campaign configuration.
 * @record
 */
API.Client.BidFloorSpec = function() {}

/**
 * Ad group billable event type.
 * @type {!API.Client.ActionType}
 * @export
 */
API.Client.BidFloorSpec.prototype.billableEvent;

/**
 * List of ISO 3166-1 alpha-2 country codes.
 * @type {!Array<!API.Client.Country>}
 * @export
 */
API.Client.BidFloorSpec.prototype.countries;

/**
 * Creative type for the bid floor request.
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.BidFloorSpec.prototype.creativeType;

/**
 * Currency for the bid floor value.
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.BidFloorSpec.prototype.currency;

/**
 * Campaign objective type.
 * @type {!API.Client.BidFloorObjectiveType}
 * @export
 */
API.Client.BidFloorSpec.prototype.objectiveType;

/**
 * Optimization goal metadata.
 * @type {!API.Client.OptimizationGoalMetadata}
 * @export
 */
API.Client.BidFloorSpec.prototype.optimizationGoalMetadata;

