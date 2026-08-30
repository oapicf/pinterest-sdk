goog.provide('API.Client.TargetingTemplate');

/**
 * @record
 */
API.Client.TargetingTemplate = function() {}

/**
 * The ID of the advertiser that this targeting template belongs to.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplate.prototype.adAccountId;

/**
 * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplate.prototype.autoTargetingEnabled;

/**
 * Targeting template created time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplate.prototype.createdTime;

/**
 * Targeting template ID.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplate.prototype.id;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplate.prototype.keywords;

/**
 * targeting template name
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplate.prototype.name;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplate.prototype.placementGroup;

/**
 * @type {!API.Client.TargetingTemplateAudienceSizing}
 * @export
 */
API.Client.TargetingTemplate.prototype.sizing;

/**
 * Indicate targeting template is active or Deleted
 * @type {!API.Client.TargetingTemplateStatus}
 * @export
 */
API.Client.TargetingTemplate.prototype.status;

/**
 * targeting profile attributes
 * @type {!API.Client.TargetingSpecOptimal}
 * @export
 */
API.Client.TargetingTemplate.prototype.targetingAttributes;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplate.prototype.trackingUrls;

/**
 * Targeting template updated time.Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplate.prototype.updatedTime;

/**
 * Inform if the targeting template is valid (ex. would be false if has revoked audience)
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplate.prototype.valid;

