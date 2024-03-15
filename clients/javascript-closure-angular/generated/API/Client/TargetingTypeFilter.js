goog.provide('API.Client.TargetingTypeFilter');

/**
 * @record
 */
API.Client.TargetingTypeFilter = function() {}

/**
 * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
 * @type {!Array<!API.Client.AdsAnalyticsTargetingType>}
 * @export
 */
API.Client.TargetingTypeFilter.prototype.targetingTypes;

