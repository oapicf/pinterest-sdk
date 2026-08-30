goog.provide('API.Client.AdGroupCreate');

/**
 * @record
 */
API.Client.AdGroupCreate = function() {}

/**
 * Advertiser ID.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.adAccountId;

/**
 * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.bidInMicroCurrency;

/**
 * @type {!API.Client.BidStrategyType}
 * @export
 */
API.Client.AdGroupCreate.prototype.bidStrategyType;

/**
 * @type {!API.Client.ActionType}
 * @export
 */
API.Client.AdGroupCreate.prototype.billableEvent;

/**
 * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.budgetInMicroCurrency;

/**
 * Campaign ID of the ad group.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.campaignId;

/**
 * oCPM learn mode
 * @type {!API.Client.ConversionLearningModeType}
 * @export
 */
API.Client.AdGroupCreate.prototype.conversionLearningModeType;

/**
 * Ad group creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.createdTime;

/**
 * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.customerSegmentId;

/**
 * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.AdGroupCreate.prototype.dcaAssets;

/**
 * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.endTime;

/**
 * @type {!API.Client.AdgroupTrackingFeatures}
 * @export
 */
API.Client.AdGroupCreate.prototype.extFeatures;

/**
 * Feed Profile ID associated to the adgroup.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.feedProfileId;

/**
 * Ad group ID.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.id;

/**
 * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupCreate.prototype.isCreativeOptimization;

/**
 * Indicates whether the ad group should use the local inventory.
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupCreate.prototype.isLocalInventory;

/**
 * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.lifetimeFrequencyCap;

/**
 * The targeting radius of the local inventory ads in miles.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.localInventoryRadiusInMiles;

/**
 * Ad group name.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.name;

/**
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @type {!API.Client.NullableOptimizationGoalMetadata}
 * @export
 */
API.Client.AdGroupCreate.prototype.optimizationGoalMetadata;

/**
 * Pinterest Performance+ campaign settings.
 * @type {!API.Client.PerformancePlusCampaignSettings}
 * @export
 */
API.Client.AdGroupCreate.prototype.performancePlusCampaignSettings;

/**
 * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
 * @type {!API.Client.PlacementGroupType}
 * @export
 */
API.Client.AdGroupCreate.prototype.placementGroup;

/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
 * @type {!API.Client.PlacementTrafficType}
 * @export
 */
API.Client.AdGroupCreate.prototype.placementTrafficType;

/**
 * Specify if the promotion is applied at ad group or item level
 * @type {!API.Client.PromotionApplicationLevel}
 * @export
 */
API.Client.AdGroupCreate.prototype.promotionApplicationLevel;

/**
 * Promotion ID. To clear this field, set to null.
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.promotionId;

/**
 * Promotion IDs list. To clear this field, set to an empty array [].
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCreate.prototype.promotionIds;

/**
 * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.startTime;

/**
 * Ad group/entity status.
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdGroupCreate.prototype.status;

/**
 * @type {!API.Client.SummaryStatus}
 * @export
 */
API.Client.AdGroupCreate.prototype.summaryStatus;

/**
 * @type {!API.Client.TargetingSpecOptimal}
 * @export
 */
API.Client.AdGroupCreate.prototype.targetingSpec;

/**
 * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCreate.prototype.targetingTemplateIds;

/**
 * @type {!API.Client.AdGroupTrackingURLs}
 * @export
 */
API.Client.AdGroupCreate.prototype.trackingUrls;

/**
 * Always \"adgroup\".
 * @type {!string}
 * @export
 */
API.Client.AdGroupCreate.prototype.type;

/**
 * Ad group last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.updatedTime;

/**
 * Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
 * @type {!boolean}
 * @export
 */
API.Client.AdGroupCreate.prototype.autoTargetingEnabled;

/**
 * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
 * @type {!number}
 * @export
 */
API.Client.AdGroupCreate.prototype.bidMultiplier;

/**
 * @type {!API.Client.BudgetType}
 * @export
 */
API.Client.AdGroupCreate.prototype.budgetType;

/**
 * @type {!API.Client.PacingDeliveryType}
 * @export
 */
API.Client.AdGroupCreate.prototype.pacingDeliveryType;

