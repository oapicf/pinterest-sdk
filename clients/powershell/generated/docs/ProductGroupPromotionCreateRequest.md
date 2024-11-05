# ProductGroupPromotionCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **String** | ID of the Ad Group the Product Group Promotion belongs to. | 
**ProductGroupPromotion** | [**ProductGroupPromotionCreateRequestElement[]**](ProductGroupPromotionCreateRequestElement.md) |  | 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotionCreateRequest = Initialize-PSOpenAPIToolsProductGroupPromotionCreateRequest  -AdGroupId 2680059592705 `
 -ProductGroupPromotion null
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotionCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

