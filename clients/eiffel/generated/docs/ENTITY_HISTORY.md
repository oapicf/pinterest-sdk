# ENTITY_HISTORY

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | **INTEGER_32** | A Unix timestamp representing the time of the change in seconds | [optional] [default to null]
**data_changes** | [**LIST [ENTITY_DATA_CHANGE_HISTORY]**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] [default to null]
**entity_id** | [**STRING_32**](STRING_32.md) | The id of the entity that was changed | [optional] [default to null]
**entity_name** | [**STRING_32**](STRING_32.md) | The name of the entity that was changed | [optional] [default to null]
**ldap** | [**STRING_32**](STRING_32.md) | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] [default to null]
**operation** | [**CHANGE_HISTORY_OPERATION_TYPE**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] [default to null]
**user_id** | [**STRING_32**](STRING_32.md) | The id of the user who initiated the change | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


