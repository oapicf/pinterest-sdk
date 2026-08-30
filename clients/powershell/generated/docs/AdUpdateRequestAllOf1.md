# AdUpdateRequestAllOf1
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of this ad. | 
**PinId** | **String** | Pin ID. This field may only be updated for draft ads. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdUpdateRequestAllOf1 = Initialize-PSOpenAPIToolsAdUpdateRequestAllOf1  -Id null `
 -PinId null
```

- Convert the resource to JSON
```powershell
$AdUpdateRequestAllOf1 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

