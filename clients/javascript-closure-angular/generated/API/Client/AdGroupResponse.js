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
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @type {!API.Client.OptimizationGoalMetadata}
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
 * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @type {!number}
 * @export
 */
API.Client.AdGroupResponse.prototype.lifetimeFrequencyCap;

/**
 * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @type {!API.Client.TrackingUrls}
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
 * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
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
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
 * @type {!string}
 * @export
 */
API.Client.AdGroupResponse.prototype.bidStrategyType;

/**
 * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupResponse.prototype.targetingTemplateIds;

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
