# BoardsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**Board[]**](Board.md) | Boards | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BoardsList200Response = Initialize-PSOpenAPIToolsBoardsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$BoardsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

