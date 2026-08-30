# TotalCountByEntityStatus

Breakdown of asset counts by entity status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **int** | Count of ACTIVE assets | [optional] 
**archived** | **int** | Count of ARCHIVED assets | [optional] 
**paused** | **int** | Count of PAUSED assets | [optional] 

## Example

```python
from pinterestsdk.models.total_count_by_entity_status import TotalCountByEntityStatus

# TODO update the JSON string below
json = "{}"
# create an instance of TotalCountByEntityStatus from a JSON string
total_count_by_entity_status_instance = TotalCountByEntityStatus.from_json(json)
# print the JSON string representation of the object
print(TotalCountByEntityStatus.to_json())

# convert the object into a dict
total_count_by_entity_status_dict = total_count_by_entity_status_instance.to_dict()
# create an instance of TotalCountByEntityStatus from a dict
total_count_by_entity_status_from_dict = TotalCountByEntityStatus.from_dict(total_count_by_entity_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


