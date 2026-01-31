# GenderFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gender** | [**CatalogsProductGroupMultipleGenderCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.gender_filter import GenderFilter

# TODO update the JSON string below
json = "{}"
# create an instance of GenderFilter from a JSON string
gender_filter_instance = GenderFilter.from_json(json)
# print the JSON string representation of the object
print(GenderFilter.to_json())

# convert the object into a dict
gender_filter_dict = gender_filter_instance.to_dict()
# create an instance of GenderFilter from a dict
gender_filter_from_dict = GenderFilter.from_dict(gender_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


