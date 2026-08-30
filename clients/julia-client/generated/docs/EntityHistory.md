# EntityHistory


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`change_timestamp`** | **`Int64`** | A Unix timestamp representing the time of the change in seconds | [optional] [default to nothing]
**`data_changes`** | [**`Vector{EntityDataChangeHistory}`**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] [default to nothing]
**`entity_id`** | **`String`** | The id of the entity that was changed | [optional] [default to nothing]
**`entity_name`** | **`String`** | The name of the entity that was changed | [optional] [default to nothing]
**`ldap`** | **`String`** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] [default to nothing]
**`operation`** | [**`*ChangeHistoryOperationType`**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] [default to nothing]
**`user_id`** | **`String`** | The id of the user who initiated the change | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


