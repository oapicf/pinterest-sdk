# WWW::OpenAPIClient::Object::EntityHistory

## Load the model package
```perl
use WWW::OpenAPIClient::Object::EntityHistory;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | **int** | A Unix timestamp representing the time of the change in seconds | [optional] 
**data_changes** | [**ARRAY[EntityDataChangeHistory]**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**entity_id** | **string** | The id of the entity that was changed | [optional] 
**entity_name** | **string** | The name of the entity that was changed | [optional] 
**ldap** | **string** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] 
**user_id** | **string** | The id of the user who initiated the change | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


