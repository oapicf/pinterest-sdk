# BoardsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Board[]**](Board.md) |  | 

## Examples

- Prepare the resource
```powershell
$BoardsList200Response = Initialize-PSOpenAPIToolsBoardsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$BoardsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

