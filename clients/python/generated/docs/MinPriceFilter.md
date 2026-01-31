# MinPriceFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_price** | [**CatalogsProductGroupPricingCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.min_price_filter import MinPriceFilter

# TODO update the JSON string below
json = "{}"
# create an instance of MinPriceFilter from a JSON string
min_price_filter_instance = MinPriceFilter.from_json(json)
# print the JSON string representation of the object
print(MinPriceFilter.to_json())

# convert the object into a dict
min_price_filter_dict = min_price_filter_instance.to_dict()
# create an instance of MinPriceFilter from a dict
min_price_filter_from_dict = MinPriceFilter.from_dict(min_price_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


