goog.provide('API.Client.TargetingTemplateCreate');

/**
 * @record
 */
API.Client.TargetingTemplateCreate = function() {}

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.autoTargetingEnabled;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.keywords;

/**
 * Name of targeting template.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.name;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.placementGroup;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.targetingAttributes;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.trackingUrls;

