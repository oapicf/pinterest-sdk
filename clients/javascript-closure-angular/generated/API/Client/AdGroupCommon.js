goog.provide('API.Client.AdGroupCommon');

/**
 * @record
 */
API.Client.AdGroupCommon = function() {}

/**
 * Ad group name.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCommon.prototype.name;

/**
 * Ad group/entity status.
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdGroupCommon.prototype.status;

/**
 * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCommon.prototype.budgetInMicroCurrency;

/**
 * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCommon.prototype.bidInMicroCurrency;

/**
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @type {!API.Client.OptimizationGoalMetadata}
 * @export
 */
API.Client.AdGroupCommon.prototype.optimizationGoalMetadata;

/**
 * @type {!API.Client.BudgetType}
 * @export
 */
API.Client.AdGroupCommon.prototype.budgetType;

/**
 * Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCommon.prototype.startTime;

/**
 * Ad group end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCommon.prototype.endTime;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.AdGroupCommon.prototype.targetingSpec;

/**
 * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCommon.prototype.lifetimeFrequencyCap;

/**
 * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.AdGroupCommon.prototype.trackingUrls;

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupCommon.prototype.autoTargetingEnabled;

/**
 * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.AdGroupCommon.prototype.placementGroup;

/**
 * @type {!API.Client.PacingDeliveryType}
 * @export
 */
API.Client.AdGroupCommon.prototype.pacingDeliveryType;

/**
 * Campaign ID of the ad group.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCommon.prototype.campaignId;

/**
 * @type {!API.Client.ActionType}
 * @export
 */
API.Client.AdGroupCommon.prototype.billableEvent;

/**
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCommon.prototype.bidStrategyType;

/**
 * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCommon.prototype.targetingTemplateIds;

/** @enum {string} */
API.Client.AdGroupCommon.BidStrategyTypeEnum = { 
  AUTOMATIC_BID: 'AUTOMATIC_BID',
  MAX_BID: 'MAX_BID',
  TARGET_AVG: 'TARGET_AVG',
  : '',
}
