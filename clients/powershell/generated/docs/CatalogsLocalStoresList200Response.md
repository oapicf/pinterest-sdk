# CatalogsLocalStoresList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**LocalStore[]**](LocalStore.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsLocalStoresList200Response = Initialize-PSOpenAPIToolsCatalogsLocalStoresList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsLocalStoresList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

