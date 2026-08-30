# EntityHistory
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangeTimestamp** | **Int32** | A Unix timestamp representing the time of the change in seconds | [optional] 
**DataChanges** | [**EntityDataChangeHistory[]**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**EntityId** | **String** | The id of the entity that was changed | [optional] 
**EntityName** | **String** | The name of the entity that was changed | [optional] 
**Ldap** | **String** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**Operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] 
**UserId** | **String** | The id of the user who initiated the change | [optional] 

## Examples

- Prepare the resource
```powershell
$EntityHistory = Initialize-PSOpenAPIToolsEntityHistory  -ChangeTimestamp null `
 -DataChanges null `
 -EntityId null `
 -EntityName null `
 -Ldap null `
 -Operation null `
 -UserId null
```

- Convert the resource to JSON
```powershell
$EntityHistory | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

