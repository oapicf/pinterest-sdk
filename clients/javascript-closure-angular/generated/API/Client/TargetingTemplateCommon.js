goog.provide('API.Client.TargetingTemplateCommon');

/**
 * @record
 */
API.Client.TargetingTemplateCommon = function() {}

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.autoTargetingEnabled;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.keywords;

/**
 * targeting template name
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.name;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.placementGroup;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.targetingAttributes;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateCommon.prototype.trackingUrls;

