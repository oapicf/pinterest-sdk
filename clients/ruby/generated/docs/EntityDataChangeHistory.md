# PinterestSdkClient::EntityDataChangeHistory

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **changed_field_id** | **String** | A string identifier representing the changed field on the entity | [optional] |
| **changed_field_name** | **String** | The human readable name of the changed field on the entity | [optional] |
| **data_type** | [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field&#39;s data values | [optional] |
| **new_data_value** | **String** | A string representation of the value of the changed field, after the change | [optional] |
| **old_data_value** | **String** | A string representation of the value of the changed field, before the change | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::EntityDataChangeHistory.new(
  changed_field_id: null,
  changed_field_name: null,
  data_type: null,
  new_data_value: null,
  old_data_value: null
)
```

