# ProductType2Filter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_type_2** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.product_type2_filter import ProductType2Filter

# TODO update the JSON string below
json = "{}"
# create an instance of ProductType2Filter from a JSON string
product_type2_filter_instance = ProductType2Filter.from_json(json)
# print the JSON string representation of the object
print(ProductType2Filter.to_json())

# convert the object into a dict
product_type2_filter_dict = product_type2_filter_instance.to_dict()
# create an instance of ProductType2Filter from a dict
product_type2_filter_from_dict = ProductType2Filter.from_dict(product_type2_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


