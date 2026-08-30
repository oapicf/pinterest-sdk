# EntityDataChangeHistory


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_field_id** | **str** | A string identifier representing the changed field on the entity | [optional] 
**changed_field_name** | **str** | The human readable name of the changed field on the entity | [optional] 
**data_type** | [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field&#39;s data values | [optional] 
**new_data_value** | **str** | A string representation of the value of the changed field, after the change | [optional] 
**old_data_value** | **str** | A string representation of the value of the changed field, before the change | [optional] 

## Example

```python
from openapi_client.models.entity_data_change_history import EntityDataChangeHistory

# TODO update the JSON string below
json = "{}"
# create an instance of EntityDataChangeHistory from a JSON string
entity_data_change_history_instance = EntityDataChangeHistory.from_json(json)
# print the JSON string representation of the object
print EntityDataChangeHistory.to_json()

# convert the object into a dict
entity_data_change_history_dict = entity_data_change_history_instance.to_dict()
# create an instance of EntityDataChangeHistory from a dict
entity_data_change_history_from_dict = EntityDataChangeHistory.from_dict(entity_data_change_history_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


