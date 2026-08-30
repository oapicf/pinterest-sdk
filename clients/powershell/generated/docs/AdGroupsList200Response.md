# AdGroupsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**AdGroup[]**](AdGroup.md) |  | 

## Examples

- Prepare the resource
```powershell
$AdGroupsList200Response = Initialize-PSOpenAPIToolsAdGroupsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdGroupsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

