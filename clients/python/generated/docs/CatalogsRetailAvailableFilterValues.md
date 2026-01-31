# CatalogsRetailAvailableFilterValues


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**filter_values** | [**CatalogsRetailFilterValuesMap**](CatalogsRetailFilterValuesMap.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_retail_available_filter_values import CatalogsRetailAvailableFilterValues

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailAvailableFilterValues from a JSON string
catalogs_retail_available_filter_values_instance = CatalogsRetailAvailableFilterValues.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailAvailableFilterValues.to_json())

# convert the object into a dict
catalogs_retail_available_filter_values_dict = catalogs_retail_available_filter_values_instance.to_dict()
# create an instance of CatalogsRetailAvailableFilterValues from a dict
catalogs_retail_available_filter_values_from_dict = CatalogsRetailAvailableFilterValues.from_dict(catalogs_retail_available_filter_values_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


