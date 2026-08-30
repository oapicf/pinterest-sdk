# PinsSaveRequestCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BoardId** | **String** | Unique identifier of the board to which the pin will be saved. | [optional] 
**BoardSectionId** | **String** | Unique identifier of the board section to which the pin will be saved. | [optional] 

## Examples

- Prepare the resource
```powershell
$PinsSaveRequestCreate = Initialize-PSOpenAPIToolsPinsSaveRequestCreate  -BoardId null `
 -BoardSectionId null
```

- Convert the resource to JSON
```powershell
$PinsSaveRequestCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

