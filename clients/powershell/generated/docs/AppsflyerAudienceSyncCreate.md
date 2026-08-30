# AppsflyerAudienceSyncCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContainerId** | **String** | The container ID of the audience | 
**UrlAdidSha256** | **String** | The pre-signed URL for SHA256 hashed GAID/IDFA file | [optional] 
**UrlEmailSha256** | **String** | The pre-signed URL for SHA256 hashed email file | [optional] 

## Examples

- Prepare the resource
```powershell
$AppsflyerAudienceSyncCreate = Initialize-PSOpenAPIToolsAppsflyerAudienceSyncCreate  -ContainerId null `
 -UrlAdidSha256 null `
 -UrlEmailSha256 null
```

- Convert the resource to JSON
```powershell
$AppsflyerAudienceSyncCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

