# MediaUploadAllOfUploadParameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**XAmzDate** | **String** |  | [optional] 
**XAmzSignature** | **String** |  | [optional] 
**XAmzSecurityToken** | **String** |  | [optional] 
**XAmzAlgorithm** | **String** |  | [optional] 
**Key** | **String** |  | [optional] 
**Policy** | **String** |  | [optional] 
**XAmzCredential** | **String** |  | [optional] 
**ContentType** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MediaUploadAllOfUploadParameters = Initialize-PSOpenAPIToolsMediaUploadAllOfUploadParameters  -XAmzDate null `
 -XAmzSignature null `
 -XAmzSecurityToken null `
 -XAmzAlgorithm null `
 -Key null `
 -Policy null `
 -XAmzCredential null `
 -ContentType multipart/form-data
```

- Convert the resource to JSON
```powershell
$MediaUploadAllOfUploadParameters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

