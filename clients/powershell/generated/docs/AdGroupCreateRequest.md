# AdGroupCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;Pinterest Performance+ targeting&quot;&quot;&lt;/a&gt;. | [optional] 
**BidMultiplier** | **Decimal** | &lt;a href&#x3D;&quot;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot;&quot; target&#x3D;&quot;&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;&quot;&quot;/docs/api-features/pinterest-performance-plus-setup/&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. | [optional] 
**BudgetType** | [**BudgetType**](BudgetType.md) |  | [optional] 
**PacingDeliveryType** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 
**BidInMicroCurrency** | **Int32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. | [optional] 
**BidStrategyType** | [**BidStrategyType**](BidStrategyType.md) |  | [optional] 
**BillableEvent** | [**ActionType**](ActionType.md) |  | 
**BudgetInMicroCurrency** | **Int32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**CampaignId** | **String** | Campaign ID of the ad group. | 
**EndTime** | **Int32** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;&quot;&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;&quot;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] 
**IsCreativeOptimization** | **Boolean** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] 
**LifetimeFrequencyCap** | **Int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;&quot;&quot;/docs/redoc/#section/Billable-event&quot;&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**Name** | **String** | Ad group name. | 
**OptimizationGoalMetadata** | [**SystemCollectionsHashtable**](.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;&quot;&quot;WEB_CONVERSION&quot;&quot;&#x60;. | [optional] 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;&quot;&quot;/docs/redoc/#section/Placement-group&quot;&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**PromotionApplicationLevel** | **String** | Specify if the promotion is applied at ad group or item level | [optional] 
**PromotionId** | **String** | Promotion ID. To clear this field, set to null. | [optional] [default to "0"]
**PromotionIds** | **String[]** | Promotion IDs list. To clear this field, set to an empty array []. | [optional] 
**StartTime** | **Int32** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;&quot;&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;&quot;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**TargetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**TargetingTemplateIds** | **String[]** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] 
**TrackingUrls** | [**SystemCollectionsHashtable**](.md) | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {&quot;&quot;&lt;a href&#x3D;&quot;&quot;/docs/redoc/#section/Tracking-URL-event&quot;&quot;&gt;Tracking event enum&lt;/a&gt;&quot;&quot;:[URL string array],...}&lt;br&gt; For example: {&quot;&quot;impression&quot;&quot;: [&quot;&quot;URL1&quot;&quot;, &quot;&quot;URL2&quot;&quot;], &quot;&quot;click&quot;&quot;: [&quot;&quot;URL1&quot;&quot;, &quot;&quot;URL2&quot;&quot;, &quot;&quot;URL3&quot;&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupCreateRequest = Initialize-PSOpenAPIToolsAdGroupCreateRequest  -AutoTargetingEnabled null `
 -BidMultiplier null `
 -BudgetType null `
 -PacingDeliveryType null `
 -BidInMicroCurrency 5000000 `
 -BidStrategyType null `
 -BillableEvent null `
 -BudgetInMicroCurrency 5000000 `
 -CampaignId 626736533506 `
 -EndTime 5705424000 `
 -IsCreativeOptimization true `
 -LifetimeFrequencyCap 100 `
 -Name Ad Group For Pin: 687195905986 `
 -OptimizationGoalMetadata null `
 -PlacementGroup null `
 -PromotionApplicationLevel ITEM `
 -PromotionId 7834020347906 `
 -PromotionIds [&quot;7834020347906&quot;,&quot;7834020347907&quot;] `
 -StartTime 5686848000 `
 -Status null `
 -TargetingSpec null `
 -TargetingTemplateIds null `
 -TrackingUrls null
```

- Convert the resource to JSON
```powershell
$AdGroupCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

