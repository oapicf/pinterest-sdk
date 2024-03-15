# AudienceUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**Name** | **String** | Audience name. | [optional] 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**Description** | **String** | Audience description. | [optional] 
**OperationType** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceUpdateRequest = Initialize-PSOpenAPIToolsAudienceUpdateRequest  -AdAccountId 549755885175 `
 -Name string `
 -Rule null `
 -Description string `
 -OperationType null
```

- Convert the resource to JSON
```powershell
$AudienceUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

