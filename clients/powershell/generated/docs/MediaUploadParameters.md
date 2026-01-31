# MediaUploadParameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentType** | **String** |  | [optional] 
**Key** | **String** |  | [optional] 
**Policy** | **String** |  | [optional] 
**XAmzAlgorithm** | **String** |  | [optional] 
**XAmzCredential** | **String** |  | [optional] 
**XAmzDate** | **String** |  | [optional] 
**XAmzSecurityToken** | **String** |  | [optional] 
**XAmzSignature** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MediaUploadParameters = Initialize-PSOpenAPIToolsMediaUploadParameters  -ContentType multipart/form-data `
 -Key uploads/11/aa/22/3:video:203014033110991560:5212123920968240771 `
 -Policy eyJleHBpcmF0aW9uIjoiMj..&#x3D;&#x3D; `
 -XAmzAlgorithm AWS4-HMAC-SHA256 `
 -XAmzCredential ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request `
 -XAmzDate 20220127T185143Z `
 -XAmzSecurityToken IQoJb3JpZ2luX2VjEJr...&#x3D;&#x3D; `
 -XAmzSignature fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92
```

- Convert the resource to JSON
```powershell
$MediaUploadParameters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

