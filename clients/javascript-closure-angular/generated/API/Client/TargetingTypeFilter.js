goog.provide('API.Client.TargetingTypeFilter');

/**
 * @record
 */
API.Client.TargetingTypeFilter = function() {}

/**
 * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
 * @type {!Array<!API.Client.AdsAnalyticsTargetingType>}
 * @export
 */
API.Client.TargetingTypeFilter.prototype.targetingTypes;

