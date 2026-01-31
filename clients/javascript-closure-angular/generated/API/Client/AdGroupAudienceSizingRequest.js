goog.provide('API.Client.AdGroupAudienceSizingRequest');

/**
 * @record
 */
API.Client.AdGroupAudienceSizingRequest = function() {}

/**
 * Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupAudienceSizingRequest.prototype.autoTargetingEnabled;

/**
 * Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupAudienceSizingRequest.prototype.creativeTypes;

/**
 * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 * @type {!Array<!API.Client.AdGroupAudienceSizingRequest_keywords_inner>}
 * @export
 */
API.Client.AdGroupAudienceSizingRequest.prototype.keywords;

/**
 * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.AdGroupAudienceSizingRequest.prototype.placementGroup;

/**
 * Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupAudienceSizingRequest.prototype.productGroupIds;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.AdGroupAudienceSizingRequest.prototype.targetingSpec;

/** @enum {string} */
API.Client.AdGroupAudienceSizingRequest.Array&lt;!CreativeTypesEnum&gt; = { 
  REGULAR: 'REGULAR',
  VIDEO: 'VIDEO',
  SHOPPING: 'SHOPPING',
  CAROUSEL: 'CAROUSEL',
  MAX_VIDEO: 'MAX_VIDEO',
  SHOP_THE_PIN: 'SHOP_THE_PIN',
  COLLECTION: 'COLLECTION',
  IDEA: 'IDEA',
}
