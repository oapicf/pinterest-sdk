# SharedAudienceResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Audience ID that was shared | [optional] 
**Permissions** | [**Role[]**](Role.md) |  | [optional] 
**RecipientAccountIds** | **String[]** | Account IDs that received the audience | [optional] 

## Examples

- Prepare the resource
```powershell
$SharedAudienceResponse = Initialize-PSOpenAPIToolsSharedAudienceResponse  -AudienceId 2542621871096 `
 -Permissions [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER] `
 -RecipientAccountIds [&quot;549755885175&quot;]
```

- Convert the resource to JSON
```powershell
$SharedAudienceResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

