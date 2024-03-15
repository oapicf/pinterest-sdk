# ItemValidationEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attribute** | **String** | The attribute that the item validation event references | [optional] 
**Code** | **Int32** | The event code that the item validation event references | [optional] 
**Message** | **String** | Title message describing the item validation event | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemValidationEvent = Initialize-PSOpenAPIToolsItemValidationEvent  -Attribute title `
 -Code 106 `
 -Message Title is missing from product metadata.
```

- Convert the resource to JSON
```powershell
$ItemValidationEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

