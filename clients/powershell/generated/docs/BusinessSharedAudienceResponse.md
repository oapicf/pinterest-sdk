# BusinessSharedAudienceResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Audience ID that was shared | [optional] 
**Permissions** | [**Role[]**](Role.md) |  | [optional] 
**RecipientBusinessIds** | **String[]** | Business IDs that received the audience | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessSharedAudienceResponse = Initialize-PSOpenAPIToolsBusinessSharedAudienceResponse  -AudienceId 2542621871096 `
 -Permissions [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER] `
 -RecipientBusinessIds [&quot;549755885175&quot;]
```

- Convert the resource to JSON
```powershell
$BusinessSharedAudienceResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

