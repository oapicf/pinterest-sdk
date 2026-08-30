goog.provide('API.Client.AdGroupAudienceSizingCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.AdGroupAudienceSizingCreate = function() {}

/**
 * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupAudienceSizingCreate.prototype.autoTargetingEnabled;

/**
 * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @type {!Array<!API.Client.AdGroupAudienceSizingCreativeTypes>}
 * @export
 */
API.Client.AdGroupAudienceSizingCreate.prototype.creativeTypes;

/**
 * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 * @type {!Array<!API.Client.AdGroupAudienceSizingKeyword>}
 * @export
 */
API.Client.AdGroupAudienceSizingCreate.prototype.keywords;

/**
 * [Placement group](/docs/redoc/#section/Placement-group).
 * @type {!API.Client.AdgroupPlacementGroupType}
 * @export
 */
API.Client.AdGroupAudienceSizingCreate.prototype.placementGroup;

/**
 * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupAudienceSizingCreate.prototype.productGroupIds;

/**
 * @type {!API.Client.TargetingSpecOptimal}
 * @export
 */
API.Client.AdGroupAudienceSizingCreate.prototype.targetingSpec;

