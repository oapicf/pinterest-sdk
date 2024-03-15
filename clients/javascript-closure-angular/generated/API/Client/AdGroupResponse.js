goog.provide('API.Client.AdGroupResponse');

/**
 * @record
 */
API.Client.AdGroupResponse = function() {}

/**
 * Ad group name.
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.name;

/**
 * Ad group/entity status.
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdGroupResponse.prototype.status;

/**
 * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.budgetInMicroCurrency;

/**
 * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.bidInMicroCurrency;

/**
 * @type {!API.Client.AdGroupCommon_optimization_goal_metadata}
 * @export
 */
API.Client.AdGroupResponse.prototype.optimizationGoalMetadata;

/**
 * @type {!API.Client.BudgetType}
 * @export
 */
API.Client.AdGroupResponse.prototype.budgetType;

/**
 * Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.startTime;

/**
 * Ad group end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.endTime;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.AdGroupResponse.prototype.targetingSpec;

/**
 * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.lifetimeFrequencyCap;

/**
 * @type {!API.Client.AdGroupCommon_tracking_urls}
 * @export
 */
API.Client.AdGroupResponse.prototype.trackingUrls;

/**
 * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupResponse.prototype.autoTargetingEnabled;

/**
 * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.AdGroupResponse.prototype.placementGroup;

/**
 * @type {!API.Client.PacingDeliveryType}
 * @export
 */
API.Client.AdGroupResponse.prototype.pacingDeliveryType;

/**
 * Campaign ID of the ad group.
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.campaignId;

/**
 * @type {!API.Client.ActionType}
 * @export
 */
API.Client.AdGroupResponse.prototype.billableEvent;

/**
 * Bid strategy type
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.bidStrategyType;

/**
 * Ad group ID.
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.id;

/**
 * Advertiser ID.
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.adAccountId;

/**
 * Ad group creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.createdTime;

/**
 * Ad group last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.updatedTime;

/**
 * Always \"adgroup\".
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.type;

/**
 * oCPM learn mode
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.conversionLearningModeType;

/**
 * Ad group summary status.
 * @type {!API.Client.AdGroupSummaryStatus}
 * @export
 */
API.Client.AdGroupResponse.prototype.summaryStatus;

/**
 * Feed Profile ID associated to the adgroup.
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.feedProfileId;

/**
 * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.AdGroupResponse.prototype.dcaAssets;

/** @enum {string} */
API.Client.AdGroupResponse.BidStrategyTypeEnum = { 
  AUTOMATIC_BID: 'AUTOMATIC_BID',
  MAX_BID: 'MAX_BID',
  TARGET_AVG: 'TARGET_AVG',
  : '',
}
/** @enum {string} */
API.Client.AdGroupResponse.ConversionLearningModeTypeEnum = { 
  NOT_ACTIVE: 'NOT_ACTIVE',
  ACTIVE: 'ACTIVE',
  : '',
}
