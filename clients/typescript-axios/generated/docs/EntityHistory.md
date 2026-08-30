# EntityHistory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | **number** | A Unix timestamp representing the time of the change in seconds | [optional] [default to undefined]
**data_changes** | [**Array&lt;EntityDataChangeHistory&gt;**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity\&#39;s data | [optional] [default to undefined]
**entity_id** | **string** | The id of the entity that was changed | [optional] [default to undefined]
**entity_name** | **string** | The name of the entity that was changed | [optional] [default to undefined]
**ldap** | **string** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] [default to undefined]
**operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] [default to undefined]
**user_id** | **string** | The id of the user who initiated the change | [optional] [default to undefined]

## Example

```typescript
import { EntityHistory } from './api';

const instance: EntityHistory = {
    change_timestamp,
    data_changes,
    entity_id,
    entity_name,
    ldap,
    operation,
    user_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
