# BoardsListPins200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**Pin[]**](Pin.md) | Pins | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BoardsListPins200Response = Initialize-PSOpenAPIToolsBoardsListPins200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$BoardsListPins200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

