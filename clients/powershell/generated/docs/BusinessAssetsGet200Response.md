# BusinessAssetsGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**GetBusinessAssetsResponse[]**](GetBusinessAssetsResponse.md) | List of assets the requesting business has access to. | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessAssetsGet200Response = Initialize-PSOpenAPIToolsBusinessAssetsGet200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$BusinessAssetsGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

