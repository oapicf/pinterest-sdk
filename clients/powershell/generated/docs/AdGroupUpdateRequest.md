# AdGroupUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Ad group name. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**BudgetInMicroCurrency** | **Int32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**BidInMicroCurrency** | **Int32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**OptimizationGoalMetadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;&quot;&quot;WEB_CONVERSION&quot;&quot;&#x60;. | [optional] 
**BudgetType** | [**BudgetType**](BudgetType.md) |  | [optional] 
**StartTime** | **Int32** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**EndTime** | **Int32** | Ad group end time. Unix timestamp in seconds. | [optional] 
**TargetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**LifetimeFrequencyCap** | **Int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;&quot;&quot;/docs/redoc/#section/Billable-event&quot;&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {&quot;&quot;&lt;a href&#x3D;&quot;&quot;/docs/redoc/#section/Tracking-URL-event&quot;&quot;&gt;Tracking event enum&lt;/a&gt;&quot;&quot;:[URL string array],...}&lt;br&gt; For example: {&quot;&quot;impression&quot;&quot;: [&quot;&quot;URL1&quot;&quot;, &quot;&quot;URL2&quot;&quot;], &quot;&quot;click&quot;&quot;: [&quot;&quot;URL1&quot;&quot;, &quot;&quot;URL2&quot;&quot;, &quot;&quot;URL3&quot;&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;. | [optional] 
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;&quot;&quot;/docs/redoc/#section/Placement-group&quot;&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**PacingDeliveryType** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 
**CampaignId** | **String** | Campaign ID of the ad group. | [optional] 
**BillableEvent** | [**ActionType**](ActionType.md) |  | [optional] 
**BidStrategyType** | **String** | Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID. | [optional] 
**TargetingTemplateIds** | **String[]** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] 
**Id** | **String** | Ad group ID. | 

## Examples

- Prepare the resource
```powershell
$AdGroupUpdateRequest = Initialize-PSOpenAPIToolsAdGroupUpdateRequest  -Name Ad Group For Pin: 687195905986 `
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
 -BidStrategyType MAX_BID `
 -TargetingTemplateIds null `
 -Id 2680060704746
```

- Convert the resource to JSON
```powershell
$AdGroupUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

