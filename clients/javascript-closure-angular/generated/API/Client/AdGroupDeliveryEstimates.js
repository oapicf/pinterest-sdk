goog.provide('API.Client.AdGroupDeliveryEstimates');

/**
 * Ad group configuration for delivery estimates.
 * @record
 */
API.Client.AdGroupDeliveryEstimates = function() {}

/**
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.autoTargetingEnabled;

/**
 * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @type {!Array<!API.Client.AdGroupAudienceSizingCreativeTypes>}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.creativeTypes;

/**
 * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 * @type {!Array<!API.Client.AdGroupDeliveryEstimatesKeywordsItems>}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.keywords;

/**
 * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
 * @type {!number}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.monthlyFrequencyCap;

/**
 * @type {!API.Client.OptimizationGoalMetadata}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.optimizationGoalMetadata;

/**
 * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
 * @type {!API.Client.OptimizationType}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.optimizationType;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.placementGroup;

/**
 * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.productGroupIds;

/**
 * @type {!API.Client.TargetingSpecOptimal}
 * @export
 */
API.Client.AdGroupDeliveryEstimates.prototype.targetingSpec;

