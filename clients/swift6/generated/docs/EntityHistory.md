# EntityHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeTimestamp** | **Int** | A Unix timestamp representing the time of the change in seconds | [optional] 
**dataChanges** | [EntityDataChangeHistory] | Properties associated with a particular change to an entity&#39;s data | [optional] 
**entityId** | **String** | The id of the entity that was changed | [optional] 
**entityName** | **String** | The name of the entity that was changed | [optional] 
**ldap** | **String** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] 
**userId** | **String** | The id of the user who initiated the change | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


