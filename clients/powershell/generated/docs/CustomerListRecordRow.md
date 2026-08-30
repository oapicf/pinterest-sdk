# CustomerListRecordRow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **String** | Email address (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**ExternalId** | **String** | External ID identifier (not hashed). | [optional] 
**HashedPhoneNumber** | **String** | Hashed phone number (hashed with SHA1, SHA256, or MD5). | [optional] 
**HashedPinnerId** | **String** | Hashed pinner ID (hashed with SHA1, SHA256, or MD5). | [optional] 
**IpAddress** | **String** | IP address (not hashed). | [optional] 
**LiverampEnvelope** | **String** | LiveRamp envelope identifier (Base64-encoded, not hashed). | [optional] 
**Maid** | **String** | Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**UserAgent** | **String** | User agent string (not hashed). | [optional] 

## Examples

- Prepare the resource
```powershell
$CustomerListRecordRow = Initialize-PSOpenAPIToolsCustomerListRecordRow  -Email null `
 -ExternalId null `
 -HashedPhoneNumber null `
 -HashedPinnerId null `
 -IpAddress null `
 -LiverampEnvelope null `
 -Maid null `
 -UserAgent null
```

- Convert the resource to JSON
```powershell
$CustomerListRecordRow | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

