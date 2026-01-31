# CustomerListUploadCreateResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerListUpload** | [**CustomerListUpload**](CustomerListUpload.md) |  | 
**S3MultipartUploadData** | [**S3MultipartUploadData**](S3MultipartUploadData.md) |  | 

## Examples

- Prepare the resource
```powershell
$CustomerListUploadCreateResponse = Initialize-PSOpenAPIToolsCustomerListUploadCreateResponse  -CustomerListUpload null `
 -S3MultipartUploadData null
```

- Convert the resource to JSON
```powershell
$CustomerListUploadCreateResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

