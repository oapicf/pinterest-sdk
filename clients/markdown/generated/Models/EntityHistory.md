# EntityHistory
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **change\_timestamp** | **Integer** | A Unix timestamp representing the time of the change in seconds | [optional] [default to null] |
| **data\_changes** | [**List**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] [default to null] |
| **entity\_id** | **String** | The id of the entity that was changed | [optional] [default to null] |
| **entity\_name** | **String** | The name of the entity that was changed | [optional] [default to null] |
| **ldap** | **String** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] [default to null] |
| **operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] [default to null] |
| **user\_id** | **String** | The id of the user who initiated the change | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

