# BusinessSharedAudience
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Unique identifier of an audience | 
**OperationType** | [**OperationType**](OperationType.md) |  | 
**RecipientBusinessIds** | **String[]** | List of business IDs to share with or revoke from. | 

## Examples

- Prepare the resource
```powershell
$BusinessSharedAudience = Initialize-PSOpenAPIToolsBusinessSharedAudience  -AudienceId 2542621871096 `
 -OperationType null `
 -RecipientBusinessIds null
```

- Convert the resource to JSON
```powershell
$BusinessSharedAudience | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

