

# AdGroupCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Ad group name. | 
**status** | **EntityStatus** | Ad group/entity status. |  [optional]
**budgetInMicroCurrency** | **Int** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. |  [optional]
**bidInMicroCurrency** | **Int** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. |  [optional]
**optimizationGoalMetadata** | [**AdGroupCommonOptimizationGoalMetadata**](AdGroupCommonOptimizationGoalMetadata.md) |  |  [optional]
**budgetType** | **BudgetType** |  |  [optional]
**startTime** | **Int** | Ad group start time. Unix timestamp in seconds. Defaults to current time. |  [optional]
**endTime** | **Int** | Ad group end time. Unix timestamp in seconds. |  [optional]
**targetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  |  [optional]
**lifetimeFrequencyCap** | **Int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. |  [optional]
**trackingUrls** | [**AdGroupCommonTrackingUrls**](AdGroupCommonTrackingUrls.md) |  |  [optional]
**autoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group.Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**placementGroup** | **PlacementGroupType** | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. |  [optional]
**pacingDeliveryType** | **PacingDeliveryType** |  |  [optional]
**campaignId** | **String** | Campaign ID of the ad group. | 
**billableEvent** | **ActionType** |  | 
**bidStrategyType** | [**BidStrategyType**](#BidStrategyType) | Bid strategy type |  [optional]


## Enum: BidStrategyType
Allowed values: [AUTOMATIC_BID, MAX_BID, TARGET_AVG, ]




