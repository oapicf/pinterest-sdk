# CatalogsProductGroupFilterOperatorTypeCriteria


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter_operator_type** | [**FilterOperatorType**](FilterOperatorType.md) |  | [optional] 
**negated** | **bool** |  | [optional] 
**values** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_filter_operator_type_criteria import CatalogsProductGroupFilterOperatorTypeCriteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupFilterOperatorTypeCriteria from a JSON string
catalogs_product_group_filter_operator_type_criteria_instance = CatalogsProductGroupFilterOperatorTypeCriteria.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupFilterOperatorTypeCriteria.to_json())

# convert the object into a dict
catalogs_product_group_filter_operator_type_criteria_dict = catalogs_product_group_filter_operator_type_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupFilterOperatorTypeCriteria from a dict
catalogs_product_group_filter_operator_type_criteria_from_dict = CatalogsProductGroupFilterOperatorTypeCriteria.from_dict(catalogs_product_group_filter_operator_type_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


