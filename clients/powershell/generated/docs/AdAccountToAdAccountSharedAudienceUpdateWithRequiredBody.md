# AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Unique identifier of an audience | 
**OperationType** | [**OperationType**](OperationType.md) |  | 
**RecipientAccountIds** | **String[]** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Examples

- Prepare the resource
```powershell
$AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = Initialize-PSOpenAPIToolsAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody  -AudienceId 2542621871096 `
 -OperationType null `
 -RecipientAccountIds null
```

- Convert the resource to JSON
```powershell
$AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

