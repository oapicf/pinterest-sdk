# BrandFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.brand_filter import BrandFilter

# TODO update the JSON string below
json = "{}"
# create an instance of BrandFilter from a JSON string
brand_filter_instance = BrandFilter.from_json(json)
# print the JSON string representation of the object
print(BrandFilter.to_json())

# convert the object into a dict
brand_filter_dict = brand_filter_instance.to_dict()
# create an instance of BrandFilter from a dict
brand_filter_from_dict = BrandFilter.from_dict(brand_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


