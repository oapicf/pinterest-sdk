# CampaignAdPreview
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Advertiser ID for this preview. | [readonly] 
**AdGroupId** | **String** | Ad group ID to create a preview record for. | 
**ClientId** | **Int32** | Client ID that created preview. | [optional] [readonly] 
**ExpiresAt** | **Int32** | Unix timestamp in milliseconds for preview expiration. | [readonly] 
**IsActive** | **Boolean** | Whether preview link is active. | [readonly] 
**PinId** | **Int32** | Pin ID for pin promotion preview. | [optional] [readonly] 
**PinPromotionId** | **Int32** | Pin promotion ID for this preview. | [optional] [readonly] 
**PromotedProductGroupId** | **Int32** | Promoted product group ID for catalog previews. | [optional] [readonly] 
**Url** | **String** | Campaign ad preview URL. | [readonly] 
**UserId** | **Int32** | User ID that created preview. | [readonly] 
**Uuid** | **String** | Pin promotion preview key. | [readonly] 

## Examples

- Prepare the resource
```powershell
$CampaignAdPreview = Initialize-PSOpenAPIToolsCampaignAdPreview  -AdAccountId 549755885175 `
 -AdGroupId 1234567890 `
 -ClientId null `
 -ExpiresAt null `
 -IsActive null `
 -PinId null `
 -PinPromotionId null `
 -PromotedProductGroupId null `
 -Url https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/ `
 -UserId null `
 -Uuid null
```

- Convert the resource to JSON
```powershell
$CampaignAdPreview | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

