# CatalogsAvailableFilterValues

Object holding available filter values for each filter key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**filter_values** | [**CatalogsCreativeAssetsFilterValuesMap**](CatalogsCreativeAssetsFilterValuesMap.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_available_filter_values import CatalogsAvailableFilterValues

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsAvailableFilterValues from a JSON string
catalogs_available_filter_values_instance = CatalogsAvailableFilterValues.from_json(json)
# print the JSON string representation of the object
print(CatalogsAvailableFilterValues.to_json())

# convert the object into a dict
catalogs_available_filter_values_dict = catalogs_available_filter_values_instance.to_dict()
# create an instance of CatalogsAvailableFilterValues from a dict
catalogs_available_filter_values_from_dict = CatalogsAvailableFilterValues.from_dict(catalogs_available_filter_values_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


