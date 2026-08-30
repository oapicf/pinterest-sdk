# MaxPriceFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_price** | [**CatalogsProductGroupPricingCriteria**](CatalogsProductGroupPricingCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.max_price_filter import MaxPriceFilter

# TODO update the JSON string below
json = "{}"
# create an instance of MaxPriceFilter from a JSON string
max_price_filter_instance = MaxPriceFilter.from_json(json)
# print the JSON string representation of the object
print(MaxPriceFilter.to_json())

# convert the object into a dict
max_price_filter_dict = max_price_filter_instance.to_dict()
# create an instance of MaxPriceFilter from a dict
max_price_filter_from_dict = MaxPriceFilter.from_dict(max_price_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


