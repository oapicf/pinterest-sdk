# CatalogsProductGroupPinsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**CatalogsProduct[]**](CatalogsProduct.md) | Pins | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupPinsList200Response = Initialize-PSOpenAPIToolsCatalogsProductGroupPinsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupPinsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

