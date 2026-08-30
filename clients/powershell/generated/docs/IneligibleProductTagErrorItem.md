# IneligibleProductTagErrorItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ErrorMessage** | [**IneligibleProductTagReason**](IneligibleProductTagReason.md) | Reason why the pin is ineligible for tagging. | 
**PinId** | **String** | Pin ID that failed eligibility check. | 

## Examples

- Prepare the resource
```powershell
$IneligibleProductTagErrorItem = Initialize-PSOpenAPIToolsIneligibleProductTagErrorItem  -ErrorMessage null `
 -PinId null
```

- Convert the resource to JSON
```powershell
$IneligibleProductTagErrorItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

