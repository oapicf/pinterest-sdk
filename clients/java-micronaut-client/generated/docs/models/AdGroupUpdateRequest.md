

# AdGroupUpdateRequest

The class is defined in **[AdGroupUpdateRequest.java](../../src/main/java/org/openapitools/model/AdGroupUpdateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | `String` | Ad group name. |  [optional property]
**status** | `EntityStatus` | Ad group/entity status. |  [optional property]
**budgetInMicroCurrency** | `Integer` | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. |  [optional property]
**bidInMicroCurrency** | `Integer` | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. |  [optional property]
**optimizationGoalMetadata** | [`AdGroupCommonOptimizationGoalMetadata`](AdGroupCommonOptimizationGoalMetadata.md) |  |  [optional property]
**budgetType** | `BudgetType` |  |  [optional property]
**startTime** | `Integer` | Ad group start time. Unix timestamp in seconds. Defaults to current time. |  [optional property]
**endTime** | `Integer` | Ad group end time. Unix timestamp in seconds. |  [optional property]
**targetingSpec** | [`TargetingSpec`](TargetingSpec.md) |  |  [optional property]
**lifetimeFrequencyCap** | `Integer` | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. |  [optional property]
**trackingUrls** | [`AdGroupCommonTrackingUrls`](AdGroupCommonTrackingUrls.md) |  |  [optional property]
**autoTargetingEnabled** | `Boolean` | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional property]
**placementGroup** | `PlacementGroupType` | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. |  [optional property]
**pacingDeliveryType** | `PacingDeliveryType` |  |  [optional property]
**campaignId** | `String` | Campaign ID of the ad group. |  [optional property]
**billableEvent** | `ActionType` |  |  [optional property]
**bidStrategyType** | [**BidStrategyTypeEnum**](#BidStrategyTypeEnum) | Bid strategy type |  [optional property]
**id** | `String` | Ad group ID. | 

















## BidStrategyTypeEnum

Name | Value
---- | -----
AUTOMATIC_BID | `"AUTOMATIC_BID"`
MAX_BID | `"MAX_BID"`
TARGET_AVG | `"TARGET_AVG"`
NULL | `"null"`



