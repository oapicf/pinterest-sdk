goog.provide('API.Client.TargetingTemplateResponseData');

/**
 * @record
 */
API.Client.TargetingTemplateResponseData = function() {}

/**
 * targeting template name
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.name;

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.autoTargetingEnabled;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.targetingAttributes;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.placementGroup;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.keywords;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.trackingUrls;

/**
 * Targeting template ID.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.id;

/**
 * Targeting template created time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.createdTime;

/**
 * Targeting template updated time.Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.updatedTime;

/**
 * The ID of the advertiser that this targeting template belongs to.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.adAccountId;

/**
 * Indicate targeting template is active or Deleted
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.status;

/**
 * @type {!API.Client.TargetingTemplateAudienceSizing}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.sizing;

/** @enum {string} */
API.Client.TargetingTemplateResponseData.StatusEnum = { 
  ACTIVE: 'ACTIVE',
  DELETED: 'DELETED',
}
