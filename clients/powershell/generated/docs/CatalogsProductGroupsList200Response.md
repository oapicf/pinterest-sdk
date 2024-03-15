# CatalogsProductGroupsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**CatalogsProductGroupsList200ResponseAllOfItemsInner[]**](CatalogsProductGroupsList200ResponseAllOfItemsInner.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupsList200Response = Initialize-PSOpenAPIToolsCatalogsProductGroupsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

