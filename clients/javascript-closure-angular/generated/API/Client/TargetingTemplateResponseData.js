goog.provide('API.Client.TargetingTemplateResponseData');

/**
 * @record
 */
API.Client.TargetingTemplateResponseData = function() {}

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.autoTargetingEnabled;

/**
 * @type {!Array<!API.Client.TargetingTemplateKeyword>}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.keywords;

/**
 * targeting template name
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.name;

/**
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.placementGroup;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.targetingAttributes;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.trackingUrls;

/**
 * The ID of the advertiser that this targeting template belongs to.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.adAccountId;

/**
 * Targeting template created time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.createdTime;

/**
 * Targeting template ID.
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.id;

/**
 * @type {!API.Client.TargetingTemplateAudienceSizing}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.sizing;

/**
 * Indicate targeting template is active or Deleted
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.status;

/**
 * Targeting template updated time.Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.TargetingTemplateResponseData.prototype.updatedTime;

/** @enum {string} */
API.Client.TargetingTemplateResponseData.StatusEnum = { 
  ACTIVE: 'ACTIVE',
  DELETED: 'DELETED',
}
