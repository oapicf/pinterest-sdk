# ErrorDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **Int32** | Number of records with this error | 
**ErrorCode** | **Int32** | Numeric error code | 
**Message** | **String** | Error message description | 

## Examples

- Prepare the resource
```powershell
$ErrorDetail = Initialize-PSOpenAPIToolsErrorDetail  -Count 20 `
 -ErrorCode 42 `
 -Message Invalid email
```

- Convert the resource to JSON
```powershell
$ErrorDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

