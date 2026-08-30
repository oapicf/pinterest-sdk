# BoardsListPins200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**PinRead[]**](PinRead.md) |  | 

## Examples

- Prepare the resource
```powershell
$BoardsListPins200Response = Initialize-PSOpenAPIToolsBoardsListPins200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$BoardsListPins200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

