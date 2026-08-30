# CampaignUpdateRequestAllOf2
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidOptions** | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  | [optional] 
**IntendedPromotionType** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsLtvOptimized** | **Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | **Boolean** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;&quot;&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/&quot;&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**IsTopOfSearch** | **Boolean** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignUpdateRequestAllOf2 = Initialize-PSOpenAPIToolsCampaignUpdateRequestAllOf2  -BidOptions null `
 -IntendedPromotionType null `
 -IsLtvOptimized null `
 -IsPerformancePlus null `
 -IsTopOfSearch null `
 -ObjectiveType null
```

- Convert the resource to JSON
```powershell
$CampaignUpdateRequestAllOf2 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

