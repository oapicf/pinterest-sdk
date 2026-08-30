# SupplementalItemValidationEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attribute** | **String** | The item attribute referenced by the validation event eg. price, availability, ad_link | 
**Code** | **Int32** | The event code that the item validation event references | 
**Message** | **String** | Title message describing the item validation event | 

## Examples

- Prepare the resource
```powershell
$SupplementalItemValidationEvent = Initialize-PSOpenAPIToolsSupplementalItemValidationEvent  -Attribute price `
 -Code 113 `
 -Message Some supplemental item data was not published due to incorrect formatting
```

- Convert the resource to JSON
```powershell
$SupplementalItemValidationEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

