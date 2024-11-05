# SharedAudienceResponseCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Audience ID that was shared | [optional] 
**Permissions** | [**Role[]**](Role.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SharedAudienceResponseCommon = Initialize-PSOpenAPIToolsSharedAudienceResponseCommon  -AudienceId 2542621871096 `
 -Permissions [&quot;RESOURCE_PINNER_LIST_READER&quot;,&quot;RESOURCE_PINNER_LIST_OWNER&quot;]
```

- Convert the resource to JSON
```powershell
$SharedAudienceResponseCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

