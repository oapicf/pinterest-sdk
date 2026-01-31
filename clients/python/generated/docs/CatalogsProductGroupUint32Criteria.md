# CatalogsProductGroupUint32Criteria


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**negated** | **bool** |  | [optional] [default to False]
**operator** | **str** |  | 
**value** | **int** |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_uint32_criteria import CatalogsProductGroupUint32Criteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupUint32Criteria from a JSON string
catalogs_product_group_uint32_criteria_instance = CatalogsProductGroupUint32Criteria.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupUint32Criteria.to_json())

# convert the object into a dict
catalogs_product_group_uint32_criteria_dict = catalogs_product_group_uint32_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupUint32Criteria from a dict
catalogs_product_group_uint32_criteria_from_dict = CatalogsProductGroupUint32Criteria.from_dict(catalogs_product_group_uint32_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


