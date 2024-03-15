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
 * @type {!API.Client.AdGroupCommon_optimization_goal_metadata}
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
 * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCommon.prototype.lifetimeFrequencyCap;

/**
 * @type {!API.Client.AdGroupCommon_tracking_urls}
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
 * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
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
 * Bid strategy type
 * @type {!string}
 * @export
 */
API.Client.AdGroupCommon.prototype.bidStrategyType;

/** @enum {string} */
API.Client.AdGroupCommon.BidStrategyTypeEnum = { 
  AUTOMATIC_BID: 'AUTOMATIC_BID',
  MAX_BID: 'MAX_BID',
  TARGET_AVG: 'TARGET_AVG',
  : '',
}
