goog.provide('API.Client.AdGroupCreateRequest');

/**
 * @record
 */
API.Client.AdGroupCreateRequest = function() {}

/**
 * Ad group name.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.name;

/**
 * Ad group/entity status.
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.status;

/**
 * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.budgetInMicroCurrency;

/**
 * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.bidInMicroCurrency;

/**
 * @type {!API.Client.AdGroupCommon_optimization_goal_metadata}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.optimizationGoalMetadata;

/**
 * @type {!API.Client.BudgetType}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.budgetType;

/**
 * Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.startTime;

/**
 * Ad group end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.endTime;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.targetingSpec;

/**
 * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.lifetimeFrequencyCap;

/**
 * @type {!API.Client.AdGroupCommon_tracking_urls}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.trackingUrls;

/**
 * Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.autoTargetingEnabled;

/**
 * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.placementGroup;

/**
 * @type {!API.Client.PacingDeliveryType}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.pacingDeliveryType;

/**
 * Campaign ID of the ad group.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.campaignId;

/**
 * @type {!API.Client.ActionType}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.billableEvent;

/**
 * Bid strategy type
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreateRequest.prototype.bidStrategyType;

/** @enum {string} */
API.Client.AdGroupCreateRequest.BidStrategyTypeEnum = { 
  AUTOMATIC_BID: 'AUTOMATIC_BID',
  MAX_BID: 'MAX_BID',
  TARGET_AVG: 'TARGET_AVG',
  : '',
}
