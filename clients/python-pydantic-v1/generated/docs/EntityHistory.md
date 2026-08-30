# EntityHistory


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_timestamp** | **int** | A Unix timestamp representing the time of the change in seconds | [optional] 
**data_changes** | [**List[EntityDataChangeHistory]**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**entity_id** | **str** | The id of the entity that was changed | [optional] 
**entity_name** | **str** | The name of the entity that was changed | [optional] 
**ldap** | **str** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**operation** | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] 
**user_id** | **str** | The id of the user who initiated the change | [optional] 

## Example

```python
from openapi_client.models.entity_history import EntityHistory

# TODO update the JSON string below
json = "{}"
# create an instance of EntityHistory from a JSON string
entity_history_instance = EntityHistory.from_json(json)
# print the JSON string representation of the object
print EntityHistory.to_json()

# convert the object into a dict
entity_history_dict = entity_history_instance.to_dict()
# create an instance of EntityHistory from a dict
entity_history_from_dict = EntityHistory.from_dict(entity_history_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


