# ProductGroupPromotionUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **String** | ID of the ad group the product group belongs to. | 
**ProductGroupPromotion** | [**ProductGroupPromotion[]**](ProductGroupPromotion.md) |  | 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotionUpdateRequest = Initialize-PSOpenAPIToolsProductGroupPromotionUpdateRequest  -AdGroupId 2680059592705 `
 -ProductGroupPromotion null
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotionUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

