# OAIEntityHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeTimestamp** | **NSNumber*** | A Unix timestamp representing the time of the change in seconds | [optional] 
**dataChanges** | [**NSArray&lt;OAIEntityDataChangeHistory&gt;***](OAIEntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**entityId** | **NSString*** | The id of the entity that was changed | [optional] 
**entityName** | **NSString*** | The name of the entity that was changed | [optional] 
**ldap** | **NSString*** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**operation** | [**OAIChangeHistoryOperationType***](OAIChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] 
**userId** | **NSString*** | The id of the user who initiated the change | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


