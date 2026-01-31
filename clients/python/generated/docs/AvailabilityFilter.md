# AvailabilityFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availability** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.availability_filter import AvailabilityFilter

# TODO update the JSON string below
json = "{}"
# create an instance of AvailabilityFilter from a JSON string
availability_filter_instance = AvailabilityFilter.from_json(json)
# print the JSON string representation of the object
print(AvailabilityFilter.to_json())

# convert the object into a dict
availability_filter_dict = availability_filter_instance.to_dict()
# create an instance of AvailabilityFilter from a dict
availability_filter_from_dict = AvailabilityFilter.from_dict(availability_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


