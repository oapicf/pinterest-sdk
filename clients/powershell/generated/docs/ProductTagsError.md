# ProductTagsError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** |  | 
**Details** | [**IneligibleProductTagsErrorDetails**](IneligibleProductTagsErrorDetails.md) | Details about which product tags failed eligibility check. | [optional] 
**Message** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ProductTagsError = Initialize-PSOpenAPIToolsProductTagsError  -Code null `
 -Details null `
 -Message null
```

- Convert the resource to JSON
```powershell
$ProductTagsError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

