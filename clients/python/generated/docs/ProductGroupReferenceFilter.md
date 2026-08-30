# ProductGroupReferenceFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_group** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.product_group_reference_filter import ProductGroupReferenceFilter

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupReferenceFilter from a JSON string
product_group_reference_filter_instance = ProductGroupReferenceFilter.from_json(json)
# print the JSON string representation of the object
print(ProductGroupReferenceFilter.to_json())

# convert the object into a dict
product_group_reference_filter_dict = product_group_reference_filter_instance.to_dict()
# create an instance of ProductGroupReferenceFilter from a dict
product_group_reference_filter_from_dict = ProductGroupReferenceFilter.from_dict(product_group_reference_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


