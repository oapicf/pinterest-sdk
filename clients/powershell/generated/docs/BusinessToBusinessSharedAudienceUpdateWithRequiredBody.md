# BusinessToBusinessSharedAudienceUpdateWithRequiredBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Unique identifier of an audience | 
**OperationType** | [**OperationType**](OperationType.md) |  | 
**RecipientBusinessIds** | **String[]** | Business IDs to share with or revoke from (request) / that received the audience (response). | 

## Examples

- Prepare the resource
```powershell
$BusinessToBusinessSharedAudienceUpdateWithRequiredBody = Initialize-PSOpenAPIToolsBusinessToBusinessSharedAudienceUpdateWithRequiredBody  -AudienceId 2542621871096 `
 -OperationType null `
 -RecipientBusinessIds null
```

- Convert the resource to JSON
```powershell
$BusinessToBusinessSharedAudienceUpdateWithRequiredBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

