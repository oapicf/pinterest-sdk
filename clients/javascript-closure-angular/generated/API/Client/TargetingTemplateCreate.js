goog.provide('API.Client.TargetingTemplateCreate');

/**
 * @record
 */
API.Client.TargetingTemplateCreate = function() {}

/**
 * Name of targeting template.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.name;

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.autoTargetingEnabled;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.targetingAttributes;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.placementGroup;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.keywords;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.trackingUrls;

