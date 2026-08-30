# CampaignCreateRequestAllOf1
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidOptions** | [**CampaignBidOptionsCreate**](CampaignBidOptionsCreate.md) |  | [optional] 
**IntendedPromotionType** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsAutomatedCampaign** | **Boolean** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\_CONVERSION - SALES - CATALOG\_SALES | [optional] 
**IsCampaignBudgetOptimization** | **Boolean** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional] 
**IsFlexibleDailyBudgets** | **Boolean** | Determine if a campaign has setup for flexible daily budgets, also known as &quot;&quot;Pinterest Performance+ budgets&quot;&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional] 
**IsLtvOptimized** | **Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | **Boolean** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;&quot;&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/&quot;&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. | [optional] [default to $false]
**IsTopOfSearch** | **Boolean** | &lt;a href&#x3D;&quot;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;&quot;&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;update it&lt;/a&gt;. | [optional] [default to $false]
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignCreateRequestAllOf1 = Initialize-PSOpenAPIToolsCampaignCreateRequestAllOf1  -BidOptions null `
 -IntendedPromotionType null `
 -IsAutomatedCampaign null `
 -IsCampaignBudgetOptimization null `
 -IsFlexibleDailyBudgets null `
 -IsLtvOptimized null `
 -IsPerformancePlus null `
 -IsTopOfSearch null `
 -ObjectiveType null `
 -Status null
```

- Convert the resource to JSON
```powershell
$CampaignCreateRequestAllOf1 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

