# PinterestSdkClient::EntityHistory

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **change_timestamp** | **Integer** | A Unix timestamp representing the time of the change in seconds | [optional] |
| **data_changes** | [**Array&lt;EntityDataChangeHistory&gt;**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] |
| **entity_id** | **String** | The id of the entity that was changed | [optional] |
| **entity_name** | **String** | The name of the entity that was changed | [optional] |
| **ldap** | **String** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] |
| **operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] |
| **user_id** | **String** | The id of the user who initiated the change | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::EntityHistory.new(
  change_timestamp: null,
  data_changes: null,
  entity_id: null,
  entity_name: null,
  ldap: null,
  operation: null,
  user_id: null
)
```

