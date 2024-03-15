

# AdGroupCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Ad group name. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. |  [optional]
**budgetInMicroCurrency** | **Integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. |  [optional]
**bidInMicroCurrency** | **Integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. |  [optional]
**optimizationGoalMetadata** | [**AdGroupCommonOptimizationGoalMetadata**](AdGroupCommonOptimizationGoalMetadata.md) |  |  [optional]
**budgetType** | [**BudgetType**](BudgetType.md) |  |  [optional]
**startTime** | **Integer** | Ad group start time. Unix timestamp in seconds. Defaults to current time. |  [optional]
**endTime** | **Integer** | Ad group end time. Unix timestamp in seconds. |  [optional]
**targetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  |  [optional]
**lifetimeFrequencyCap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. |  [optional]
**trackingUrls** | [**AdGroupCommonTrackingUrls**](AdGroupCommonTrackingUrls.md) |  |  [optional]
**autoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**placementGroup** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. |  [optional]
**pacingDeliveryType** | [**PacingDeliveryType**](PacingDeliveryType.md) |  |  [optional]
**campaignId** | **String** | Campaign ID of the ad group. |  [optional]
**billableEvent** | [**ActionType**](ActionType.md) |  |  [optional]
**bidStrategyType** | [**BidStrategyTypeEnum**](#BidStrategyTypeEnum) | Bid strategy type |  [optional]


## Enum: BidStrategyTypeEnum

Name | Value
---- | -----




