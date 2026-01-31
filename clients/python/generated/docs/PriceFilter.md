# PriceFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | [**CatalogsProductGroupPricingCurrencyCriteria**](CatalogsProductGroupPricingCurrencyCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.price_filter import PriceFilter

# TODO update the JSON string below
json = "{}"
# create an instance of PriceFilter from a JSON string
price_filter_instance = PriceFilter.from_json(json)
# print the JSON string representation of the object
print(PriceFilter.to_json())

# convert the object into a dict
price_filter_dict = price_filter_instance.to_dict()
# create an instance of PriceFilter from a dict
price_filter_from_dict = PriceFilter.from_dict(price_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


