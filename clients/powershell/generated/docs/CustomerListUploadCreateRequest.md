# CustomerListUploadCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**TotalParts** | **Int32** | Number of parts to upload the file in. | 

## Examples

- Prepare the resource
```powershell
$CustomerListUploadCreateRequest = Initialize-PSOpenAPIToolsCustomerListUploadCreateRequest  -Operation null `
 -TotalParts 2
```

- Convert the resource to JSON
```powershell
$CustomerListUploadCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

