# Org.OpenAPITools.Model.EntityHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangeTimestamp** | **int** | A Unix timestamp representing the time of the change in seconds | [optional] 
**DataChanges** | [**List&lt;EntityDataChangeHistory&gt;**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**EntityId** | **string** | The id of the entity that was changed | [optional] 
**EntityName** | **string** | The name of the entity that was changed | [optional] 
**Ldap** | **string** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**Operation** | **ChangeHistoryOperationType** | The type of operation that caused the change | [optional] 
**UserId** | **string** | The id of the user who initiated the change | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

