# MultipleProductGroupsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**feed_id** | **str** | Catalog Feed id pertaining to the catalog product group. | 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] [default to False]
**name** | **str** |  | 

## Example

```python
from pinterestsdk.models.multiple_product_groups_inner import MultipleProductGroupsInner

# TODO update the JSON string below
json = "{}"
# create an instance of MultipleProductGroupsInner from a JSON string
multiple_product_groups_inner_instance = MultipleProductGroupsInner.from_json(json)
# print the JSON string representation of the object
print(MultipleProductGroupsInner.to_json())

# convert the object into a dict
multiple_product_groups_inner_dict = multiple_product_groups_inner_instance.to_dict()
# create an instance of MultipleProductGroupsInner from a dict
multiple_product_groups_inner_from_dict = MultipleProductGroupsInner.from_dict(multiple_product_groups_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


