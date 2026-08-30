# AdGroupBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | Advertiser ID. | [optional] [readonly] 
**bidInMicroCurrency** | **int** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**bidStrategyType** | [**OpenAPI\Server\Model\BidStrategyType**](BidStrategyType.md) |  | [optional] 
**billableEvent** | [**OpenAPI\Server\Model\ActionType**](ActionType.md) |  | 
**budgetInMicroCurrency** | **int** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**campaignId** | **string** | Campaign ID of the ad group. | 
**conversionLearningModeType** | [**OpenAPI\Server\Model\ConversionLearningModeType**](ConversionLearningModeType.md) | oCPM learn mode | [readonly] 
**createdTime** | **int** | Ad group creation time. Unix timestamp in seconds. | [readonly] 
**customerSegmentId** | **string** | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. | [optional] 
**dcaAssets** | [**AnyType**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] [readonly] 
**endTime** | **int** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional] 
**extFeatures** | [**OpenAPI\Server\Model\AdgroupTrackingFeatures**](AdgroupTrackingFeatures.md) |  | [optional] 
**feedProfileId** | **string** | Feed Profile ID associated to the adgroup. | [optional] 
**id** | **string** | Ad group ID. | 
**isCreativeOptimization** | **bool** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] 
**isLocalInventory** | **bool** | Indicates whether the ad group should use the local inventory. | [optional] 
**lifetimeFrequencyCap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**localInventoryRadiusInMiles** | **float** | The targeting radius of the local inventory ads in miles. | [optional] 
**name** | **string** | Ad group name. | 
**optimizationGoalMetadata** | [**OpenAPI\Server\Model\NullableOptimizationGoalMetadata**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] 
**performancePlusCampaignSettings** | [**OpenAPI\Server\Model\PerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] 
**placementGroup** | [**OpenAPI\Server\Model\PlacementGroupType**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional] 
**placementTrafficType** | [**OpenAPI\Server\Model\PlacementTrafficType**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional] 
**promotionApplicationLevel** | [**OpenAPI\Server\Model\PromotionApplicationLevel**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level | [optional] 
**promotionId** | **string** | Promotion ID. To clear this field, set to null. | [optional] [default to '0']
**promotionIds** | **string** | Promotion IDs list. To clear this field, set to an empty array []. | [optional] 
**startTime** | **int** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**summaryStatus** | [**OpenAPI\Server\Model\SummaryStatus**](SummaryStatus.md) |  | [readonly] 
**targetingSpec** | [**OpenAPI\Server\Model\TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 
**targetingTemplateIds** | **string** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\AdGroupTrackingURLs**](AdGroupTrackingURLs.md) |  | [optional] 
**type** | **string** | Always \&quot;adgroup\&quot;. | [readonly] [default to 'adgroup']
**updatedTime** | **int** | Ad group last update time. Unix timestamp in seconds. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


