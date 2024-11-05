goog.provide('API.Client.TargetingTemplateCommon');

/**
 * @record
 */
API.Client.TargetingTemplateCommon = function() {}

/**
 * targeting template name
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.name;

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.autoTargetingEnabled;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.targetingAttributes;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.placementGroup;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.keywords;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.trackingUrls;

