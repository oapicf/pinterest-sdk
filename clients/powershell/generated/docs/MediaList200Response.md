# MediaList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**MediaUploadDetails[]**](MediaUploadDetails.md) | Media | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MediaList200Response = Initialize-PSOpenAPIToolsMediaList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$MediaList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

