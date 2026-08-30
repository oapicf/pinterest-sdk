# ProductType3Filter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_type_3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.product_type3_filter import ProductType3Filter

# TODO update the JSON string below
json = "{}"
# create an instance of ProductType3Filter from a JSON string
product_type3_filter_instance = ProductType3Filter.from_json(json)
# print the JSON string representation of the object
print(ProductType3Filter.to_json())

# convert the object into a dict
product_type3_filter_dict = product_type3_filter_instance.to_dict()
# create an instance of ProductType3Filter from a dict
product_type3_filter_from_dict = ProductType3Filter.from_dict(product_type3_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


