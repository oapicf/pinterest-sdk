# BusinessAssetsGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**GetBusinessAssetsResponse[]**](GetBusinessAssetsResponse.md) | List of assets the requesting business has access to. | 

## Examples

- Prepare the resource
```powershell
$BusinessAssetsGet200Response = Initialize-PSOpenAPIToolsBusinessAssetsGet200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$BusinessAssetsGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

