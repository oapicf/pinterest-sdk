# AdGroupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Ad group name. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**budgetInMicroCurrency** | **int** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**bidInMicroCurrency** | **int** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**optimizationGoalMetadata** | [**OpenAPI\Server\Model\AdGroupCommonOptimizationGoalMetadata**](AdGroupCommonOptimizationGoalMetadata.md) |  | [optional] 
**budgetType** | [**OpenAPI\Server\Model\BudgetType**](BudgetType.md) |  | [optional] 
**startTime** | **int** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**endTime** | **int** | Ad group end time. Unix timestamp in seconds. | [optional] 
**targetingSpec** | [**OpenAPI\Server\Model\TargetingSpec**](TargetingSpec.md) |  | [optional] 
**lifetimeFrequencyCap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\AdGroupCommonTrackingUrls**](AdGroupCommonTrackingUrls.md) |  | [optional] 
**autoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**placementGroup** | [**OpenAPI\Server\Model\PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**pacingDeliveryType** | [**OpenAPI\Server\Model\PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 
**campaignId** | **string** | Campaign ID of the ad group. | [optional] 
**billableEvent** | [**OpenAPI\Server\Model\ActionType**](ActionType.md) |  | [optional] 
**bidStrategyType** | **string** | Bid strategy type | [optional] 
**id** | **string** | Ad group ID. | [optional] 
**adAccountId** | **string** | Advertiser ID. | [optional] 
**createdTime** | **int** | Ad group creation time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **int** | Ad group last update time. Unix timestamp in seconds. | [optional] 
**type** | **string** | Always \&quot;adgroup\&quot;. | [optional] [default to 'adgroup']
**conversionLearningModeType** | **string** | oCPM learn mode | [optional] 
**summaryStatus** | [**OpenAPI\Server\Model\AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] 
**feedProfileId** | **string** | Feed Profile ID associated to the adgroup. | [optional] 
**dcaAssets** | [**AnyType**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


