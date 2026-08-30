goog.provide('API.Client.TargetingTemplateCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.TargetingTemplateCreate = function() {}

/**
 * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
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
 * targeting template name
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
 * targeting profile attributes
 * @type {!API.Client.TargetingSpecOptimal}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.targetingAttributes;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateCreate.prototype.trackingUrls;

