goog.provide('API.Client.AdGroupCommon_optimization_goal_metadata');

/**
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @record
 */
API.Client.AdGroupCommonOptimizationGoalMetadata = function() {}

/**
 * @type {!API.Client.OptimizationGoalMetadata_conversion_tag_v3_goal_metadata}
 * @export
 */
API.Client.AdGroupCommonOptimizationGoalMetadata.prototype.conversionTagV3GoalMetadata;

/**
 * @type {!API.Client.OptimizationGoalMetadata_frequency_goal_metadata}
 * @export
 */
API.Client.AdGroupCommonOptimizationGoalMetadata.prototype.frequencyGoalMetadata;

/**
 * @type {!API.Client.OptimizationGoalMetadata_scrollup_goal_metadata}
 * @export
 */
API.Client.AdGroupCommonOptimizationGoalMetadata.prototype.scrollupGoalMetadata;

