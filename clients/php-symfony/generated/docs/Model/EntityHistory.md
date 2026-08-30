# EntityHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeTimestamp** | **int** | A Unix timestamp representing the time of the change in seconds | [optional] 
**dataChanges** | [**OpenAPI\Server\Model\EntityDataChangeHistory**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**entityId** | **string** | The id of the entity that was changed | [optional] 
**entityName** | **string** | The name of the entity that was changed | [optional] 
**ldap** | **string** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**operation** | [**OpenAPI\Server\Model\ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] 
**userId** | **string** | The id of the user who initiated the change | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


