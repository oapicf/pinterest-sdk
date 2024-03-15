# ProductGroupPromotionsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**ProductGroupPromotionResponseItem[]**](ProductGroupPromotionResponseItem.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotionsList200Response = Initialize-PSOpenAPIToolsProductGroupPromotionsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotionsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

