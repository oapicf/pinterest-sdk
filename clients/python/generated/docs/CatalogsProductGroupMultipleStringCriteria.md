# CatalogsProductGroupMultipleStringCriteria


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**negated** | **bool** |  | [optional] 
**values** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_multiple_string_criteria import CatalogsProductGroupMultipleStringCriteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupMultipleStringCriteria from a JSON string
catalogs_product_group_multiple_string_criteria_instance = CatalogsProductGroupMultipleStringCriteria.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupMultipleStringCriteria.to_json())

# convert the object into a dict
catalogs_product_group_multiple_string_criteria_dict = catalogs_product_group_multiple_string_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupMultipleStringCriteria from a dict
catalogs_product_group_multiple_string_criteria_from_dict = CatalogsProductGroupMultipleStringCriteria.from_dict(catalogs_product_group_multiple_string_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


