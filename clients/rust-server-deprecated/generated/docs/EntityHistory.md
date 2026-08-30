# EntityHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | **i32** | A Unix timestamp representing the time of the change in seconds | [optional] [default to None]
**data_changes** | [**Vec<models::EntityDataChangeHistory>**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity's data | [optional] [default to None]
**entity_id** | **String** | The id of the entity that was changed | [optional] [default to None]
**entity_name** | **String** | The name of the entity that was changed | [optional] [default to None]
**ldap** | **String** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] [default to None]
**operation** | [***models::ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] [default to None]
**user_id** | **String** | The id of the user who initiated the change | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


