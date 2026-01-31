# S3MultipartUploadData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileParts** | [**S3FilePart[]**](S3FilePart.md) | Array of file parts with pre-signed URLs. | [optional] 

## Examples

- Prepare the resource
```powershell
$S3MultipartUploadData = Initialize-PSOpenAPIToolsS3MultipartUploadData  -FileParts null
```

- Convert the resource to JSON
```powershell
$S3MultipartUploadData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

