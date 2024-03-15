# AdGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Ad group name. | 
**Status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**BudgetInMicroCurrency** | **Int32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**BidInMicroCurrency** | **Int32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**OptimizationGoalMetadata** | [**AdGroupCommonOptimizationGoalMetadata**](AdGroupCommonOptimizationGoalMetadata.md) |  | [optional] 
**BudgetType** | [**BudgetType**](BudgetType.md) |  | [optional] [default to "DAILY"]
**StartTime** | **Int32** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**EndTime** | **Int32** | Ad group end time. Unix timestamp in seconds. | [optional] 
**TargetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**LifetimeFrequencyCap** | **Int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;&quot;&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event&quot;&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**TrackingUrls** | [**AdGroupCommonTrackingUrls**](AdGroupCommonTrackingUrls.md) |  | [optional] 
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group.Default value is True. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;&quot;&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group&quot;&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**PacingDeliveryType** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [default to "STANDARD"]
**CampaignId** | **String** | Campaign ID of the ad group. | 
**BillableEvent** | [**ActionType**](ActionType.md) |  | 
**BidStrategyType** | **String** | Bid strategy type | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupCreateRequest = Initialize-PSOpenAPIToolsAdGroupCreateRequest  -Name Ad Group For Pin: 687195905986 `
 -Status null `
 -BudgetInMicroCurrency 5000000 `
 -BidInMicroCurrency 5000000 `
 -OptimizationGoalMetadata null `
 -BudgetType null `
 -StartTime 5686848000 `
 -EndTime 5705424000 `
 -TargetingSpec null `
 -LifetimeFrequencyCap 100 `
 -TrackingUrls null `
 -AutoTargetingEnabled true `
 -PlacementGroup null `
 -PacingDeliveryType null `
 -CampaignId 626736533506 `
 -BillableEvent null `
 -BidStrategyType MAX_BID
```

- Convert the resource to JSON
```powershell
$AdGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

