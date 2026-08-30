# EntityHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | **int** | A Unix timestamp representing the time of the change in seconds | [optional]
**data_changes** | [**\OpenAPI\Client\Model\EntityDataChangeHistory[]**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional]
**entity_id** | **string** | The id of the entity that was changed | [optional]
**entity_name** | **string** | The name of the entity that was changed | [optional]
**ldap** | **string** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional]
**operation** | [**\OpenAPI\Client\Model\ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional]
**user_id** | **string** | The id of the user who initiated the change | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
