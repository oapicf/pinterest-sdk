# EntityHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | Option<**i32**> | A Unix timestamp representing the time of the change in seconds | [optional]
**data_changes** | Option<[**Vec<models::EntityDataChangeHistory>**](EntityDataChangeHistory.md)> | Properties associated with a particular change to an entity's data | [optional]
**entity_id** | Option<**String**> | The id of the entity that was changed | [optional]
**entity_name** | Option<**String**> | The name of the entity that was changed | [optional]
**ldap** | Option<**String**> | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional]
**operation** | Option<[**models::ChangeHistoryOperationType**](ChangeHistoryOperationType.md)> | The type of operation that caused the change | [optional]
**user_id** | Option<**String**> | The id of the user who initiated the change | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


