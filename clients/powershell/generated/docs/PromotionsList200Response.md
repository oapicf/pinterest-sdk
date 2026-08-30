# PromotionsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Promotion[]**](Promotion.md) |  | 

## Examples

- Prepare the resource
```powershell
$PromotionsList200Response = Initialize-PSOpenAPIToolsPromotionsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$PromotionsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

