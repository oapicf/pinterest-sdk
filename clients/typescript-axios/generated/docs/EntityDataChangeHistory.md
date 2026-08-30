# EntityDataChangeHistory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_field_id** | **string** | A string identifier representing the changed field on the entity | [optional] [default to undefined]
**changed_field_name** | **string** | The human readable name of the changed field on the entity | [optional] [default to undefined]
**data_type** | [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field\&#39;s data values | [optional] [default to undefined]
**new_data_value** | **string** | A string representation of the value of the changed field, after the change | [optional] [default to undefined]
**old_data_value** | **string** | A string representation of the value of the changed field, before the change | [optional] [default to undefined]

## Example

```typescript
import { EntityDataChangeHistory } from './api';

const instance: EntityDataChangeHistory = {
    changed_field_id,
    changed_field_name,
    data_type,
    new_data_value,
    old_data_value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
