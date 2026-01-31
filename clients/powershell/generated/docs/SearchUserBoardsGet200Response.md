# SearchUserBoardsGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Board[]**](Board.md) | items | 

## Examples

- Prepare the resource
```powershell
$SearchUserBoardsGet200Response = Initialize-PSOpenAPIToolsSearchUserBoardsGet200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$SearchUserBoardsGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

