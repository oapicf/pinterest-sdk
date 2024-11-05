goog.provide('API.Client.TargetingTemplateGetResponseData');

/**
 * @record
 */
API.Client.TargetingTemplateGetResponseData = function() {}

/**
 * targeting template name
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.name;

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.autoTargetingEnabled;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.targetingAttributes;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.placementGroup;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.keywords;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.trackingUrls;

/**
 * Targeting template ID.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.id;

/**
 * Targeting template created time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.createdTime;

/**
 * Targeting template updated time.Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.updatedTime;

/**
 * The ID of the advertiser that this targeting template belongs to.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.adAccountId;

/**
 * Indicate targeting template is active or Deleted
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.status;

/**
 * @type {!API.Client.TargetingTemplateAudienceSizing}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.sizing;

/**
 * Inform if the targeting template is valid (ex. would be false if has revoked audience)
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateGetResponseData.prototype.valid;

/** @enum {string} */
API.Client.TargetingTemplateGetResponseData.StatusEnum = { 
  ACTIVE: 'ACTIVE',
  DELETED: 'DELETED',
}
