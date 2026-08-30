# openapi::EntityHistory


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | **integer** | A Unix timestamp representing the time of the change in seconds | [optional] 
**data_changes** | [**array[EntityDataChangeHistory]**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**entity_id** | **character** | The id of the entity that was changed | [optional] [Pattern: ^\\d+$] 
**entity_name** | **character** | The name of the entity that was changed | [optional] 
**ldap** | **character** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] [Enum: ] 
**user_id** | **character** | The id of the user who initiated the change | [optional] [Pattern: ^\\d+$] 


