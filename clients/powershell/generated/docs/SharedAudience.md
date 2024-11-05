# SharedAudience
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Unique identifier of an audience | 
**OperationType** | [**OperationType**](OperationType.md) |  | 
**RecipientAccountIds** | **String[]** | List of ad account IDs to share with or revoke from. | 

## Examples

- Prepare the resource
```powershell
$SharedAudience = Initialize-PSOpenAPIToolsSharedAudience  -AudienceId 2542621871096 `
 -OperationType null `
 -RecipientAccountIds null
```

- Convert the resource to JSON
```powershell
$SharedAudience | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

