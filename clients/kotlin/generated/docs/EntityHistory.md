
# EntityHistory

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **changeTimestamp** | **kotlin.Int** | A Unix timestamp representing the time of the change in seconds |  [optional] |
| **dataChanges** | [**kotlin.collections.List&lt;EntityDataChangeHistory&gt;**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data |  [optional] |
| **entityId** | **kotlin.String** | The id of the entity that was changed |  [optional] |
| **entityName** | **kotlin.String** | The name of the entity that was changed |  [optional] |
| **ldap** | **kotlin.String** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users |  [optional] |
| **operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change |  [optional] |
| **userId** | **kotlin.String** | The id of the user who initiated the change |  [optional] |



