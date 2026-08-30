
package org.openapitools.client.model


case class AdGroupCreate (
    /* Advertiser ID. */
    _adAccountId: Option[String],
    /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    _bidInMicroCurrency: Option[Integer],
    _bidStrategyType: Option[BidStrategyType],
    _billableEvent: ActionType,
    /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    _budgetInMicroCurrency: Option[Integer],
    /* Campaign ID of the ad group. */
    _campaignId: String,
    /* oCPM learn mode */
    _conversionLearningModeType: ConversionLearningModeType,
    /* Ad group creation time. Unix timestamp in seconds. */
    _createdTime: Integer,
    /* Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'. */
    _customerSegmentId: Option[String],
    /* [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */
    _dcaAssets: Option[AnyType],
    /* Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. */
    _endTime: Option[Integer],
    _extFeatures: Option[AdgroupTrackingFeatures],
    /* Feed Profile ID associated to the adgroup. */
    _feedProfileId: Option[String],
    /* Ad group ID. */
    _id: String,
    /* Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. */
    _isCreativeOptimization: Option[Boolean],
    /* Indicates whether the ad group should use the local inventory. */
    _isLocalInventory: Option[Boolean],
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field. */
    _lifetimeFrequencyCap: Option[Integer],
    /* The targeting radius of the local inventory ads in miles. */
    _localInventoryRadiusInMiles: Option[Number],
    /* Ad group name. */
    _name: String,
    /* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
    _optimizationGoalMetadata: Option[NullableOptimizationGoalMetadata],
    /* Pinterest Performance+ campaign settings. */
    _performancePlusCampaignSettings: Option[PerformancePlusCampaignSettings],
    /* [Placement group](https://help.pinterest.com/en/business/article/placement-groups). */
    _placementGroup: Option[PlacementGroupType],
    /* A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both */
    _placementTrafficType: Option[PlacementTrafficType],
    /* Specify if the promotion is applied at ad group or item level */
    _promotionApplicationLevel: Option[PromotionApplicationLevel],
    /* Promotion ID. To clear this field, set to null. */
    _promotionId: Option[String],
    /* Promotion IDs list. To clear this field, set to an empty array []. */
    _promotionIds: Option[List[String]],
    /* Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
    _startTime: Option[Integer],
    /* Ad group/entity status. */
    _status: Option[EntityStatus],
    _summaryStatus: SummaryStatus,
    _targetingSpec: Option[TargetingSpecOptimal],
    /* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
    _targetingTemplateIds: Option[List[String]],
    _trackingUrls: Option[AdGroupTrackingURLs],
    /* Always \"adgroup\". */
    _type: String,
    /* Ad group last update time. Unix timestamp in seconds. */
    _updatedTime: Integer,
    /* Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting). */
    _autoTargetingEnabled: Option[Boolean],
    /* [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). */
    _bidMultiplier: Option[Number],
    _budgetType: Option[BudgetType],
    _pacingDeliveryType: Option[PacingDeliveryType]
)
object AdGroupCreate {
    def toStringBody(var_adAccountId: Object, var_bidInMicroCurrency: Object, var_bidStrategyType: Object, var_billableEvent: Object, var_budgetInMicroCurrency: Object, var_campaignId: Object, var_conversionLearningModeType: Object, var_createdTime: Object, var_customerSegmentId: Object, var_dcaAssets: Object, var_endTime: Object, var_extFeatures: Object, var_feedProfileId: Object, var_id: Object, var_isCreativeOptimization: Object, var_isLocalInventory: Object, var_lifetimeFrequencyCap: Object, var_localInventoryRadiusInMiles: Object, var_name: Object, var_optimizationGoalMetadata: Object, var_performancePlusCampaignSettings: Object, var_placementGroup: Object, var_placementTrafficType: Object, var_promotionApplicationLevel: Object, var_promotionId: Object, var_promotionIds: Object, var_startTime: Object, var_status: Object, var_summaryStatus: Object, var_targetingSpec: Object, var_targetingTemplateIds: Object, var_trackingUrls: Object, var_type: Object, var_updatedTime: Object, var_autoTargetingEnabled: Object, var_bidMultiplier: Object, var_budgetType: Object, var_pacingDeliveryType: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"bidInMicroCurrency":$var_bidInMicroCurrency,"bidStrategyType":$var_bidStrategyType,"billableEvent":$var_billableEvent,"budgetInMicroCurrency":$var_budgetInMicroCurrency,"campaignId":$var_campaignId,"conversionLearningModeType":$var_conversionLearningModeType,"createdTime":$var_createdTime,"customerSegmentId":$var_customerSegmentId,"dcaAssets":$var_dcaAssets,"endTime":$var_endTime,"extFeatures":$var_extFeatures,"feedProfileId":$var_feedProfileId,"id":$var_id,"isCreativeOptimization":$var_isCreativeOptimization,"isLocalInventory":$var_isLocalInventory,"lifetimeFrequencyCap":$var_lifetimeFrequencyCap,"localInventoryRadiusInMiles":$var_localInventoryRadiusInMiles,"name":$var_name,"optimizationGoalMetadata":$var_optimizationGoalMetadata,"performancePlusCampaignSettings":$var_performancePlusCampaignSettings,"placementGroup":$var_placementGroup,"placementTrafficType":$var_placementTrafficType,"promotionApplicationLevel":$var_promotionApplicationLevel,"promotionId":$var_promotionId,"promotionIds":$var_promotionIds,"startTime":$var_startTime,"status":$var_status,"summaryStatus":$var_summaryStatus,"targetingSpec":$var_targetingSpec,"targetingTemplateIds":$var_targetingTemplateIds,"trackingUrls":$var_trackingUrls,"type":$var_type,"updatedTime":$var_updatedTime,"autoTargetingEnabled":$var_autoTargetingEnabled,"bidMultiplier":$var_bidMultiplier,"budgetType":$var_budgetType,"pacingDeliveryType":$var_pacingDeliveryType
        | }
        """.stripMargin
}
