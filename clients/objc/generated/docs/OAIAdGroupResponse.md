# OAIAdGroupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | Ad group name. | [optional] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) | Ad group/entity status. | [optional] 
**budgetInMicroCurrency** | **NSNumber*** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**bidInMicroCurrency** | **NSNumber*** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**optimizationGoalMetadata** | [**OAIAdGroupCommonOptimizationGoalMetadata***](OAIAdGroupCommonOptimizationGoalMetadata.md) |  | [optional] 
**budgetType** | [**OAIBudgetType***](OAIBudgetType.md) |  | [optional] 
**startTime** | **NSNumber*** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**endTime** | **NSNumber*** | Ad group end time. Unix timestamp in seconds. | [optional] 
**targetingSpec** | [**OAITargetingSpec***](OAITargetingSpec.md) |  | [optional] 
**lifetimeFrequencyCap** | **NSNumber*** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**trackingUrls** | [**OAIAdGroupCommonTrackingUrls***](OAIAdGroupCommonTrackingUrls.md) |  | [optional] 
**autoTargetingEnabled** | **NSNumber*** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**placementGroup** | [**OAIPlacementGroupType***](OAIPlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**pacingDeliveryType** | [**OAIPacingDeliveryType***](OAIPacingDeliveryType.md) |  | [optional] 
**campaignId** | **NSString*** | Campaign ID of the ad group. | [optional] 
**billableEvent** | [**OAIActionType***](OAIActionType.md) |  | [optional] 
**bidStrategyType** | **NSString*** | Bid strategy type | [optional] 
**_id** | **NSString*** | Ad group ID. | [optional] 
**adAccountId** | **NSString*** | Advertiser ID. | [optional] 
**createdTime** | **NSNumber*** | Ad group creation time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **NSNumber*** | Ad group last update time. Unix timestamp in seconds. | [optional] 
**type** | **NSString*** | Always \&quot;adgroup\&quot;. | [optional] [default to @"adgroup"]
**conversionLearningModeType** | **NSString*** | oCPM learn mode | [optional] 
**summaryStatus** | [**OAIAdGroupSummaryStatus***](OAIAdGroupSummaryStatus.md) | Ad group summary status. | [optional] 
**feedProfileId** | **NSString*** | Feed Profile ID associated to the adgroup. | [optional] 
**dcaAssets** | [**OAIAnyType***](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


