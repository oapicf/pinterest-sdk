# BusinessToAdAccountSharedAudience
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Unique identifier of an audience | 
**Permissions** | [**Role[]**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**RecipientAccountIds** | **String[]** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Examples

- Prepare the resource
```powershell
$BusinessToAdAccountSharedAudience = Initialize-PSOpenAPIToolsBusinessToAdAccountSharedAudience  -AudienceId 2542621871096 `
 -Permissions [&quot;RESOURCE_PINNER_LIST_READER&quot;,&quot;RESOURCE_PINNER_LIST_OWNER&quot;] `
 -RecipientAccountIds null
```

- Convert the resource to JSON
```powershell
$BusinessToAdAccountSharedAudience | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

