# S3FilePart
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartNumber** | **Int32** | Part number for upload. | 
**PresignedUrl** | **String** | Pre-signed URL. | 

## Examples

- Prepare the resource
```powershell
$S3FilePart = Initialize-PSOpenAPIToolsS3FilePart  -PartNumber 1 `
 -PresignedUrl null
```

- Convert the resource to JSON
```powershell
$S3FilePart | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

