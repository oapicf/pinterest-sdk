# CurrencyFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**CatalogsProductGroupCurrencyCriteria**](CatalogsProductGroupCurrencyCriteria.md) |  | 

## Example

```python
from openapi_client.models.currency_filter import CurrencyFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CurrencyFilter from a JSON string
currency_filter_instance = CurrencyFilter.from_json(json)
# print the JSON string representation of the object
print CurrencyFilter.to_json()

# convert the object into a dict
currency_filter_dict = currency_filter_instance.to_dict()
# create an instance of CurrencyFilter from a dict
currency_filter_from_dict = CurrencyFilter.from_dict(currency_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


