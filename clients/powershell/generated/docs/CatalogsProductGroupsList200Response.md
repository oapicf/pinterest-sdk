# CatalogsProductGroupsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**CatalogsVerticalProductGroup[]**](CatalogsVerticalProductGroup.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupsList200Response = Initialize-PSOpenAPIToolsCatalogsProductGroupsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

