# PriceFilterPrice


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**negated** | **bool** |  | [optional] 
**operator** | [**NumericFilterOperatorType**](NumericFilterOperatorType.md) |  | 
**value** | **float** |  | 

## Example

```python
from openapi_client.models.price_filter_price import PriceFilterPrice

# TODO update the JSON string below
json = "{}"
# create an instance of PriceFilterPrice from a JSON string
price_filter_price_instance = PriceFilterPrice.from_json(json)
# print the JSON string representation of the object
print PriceFilterPrice.to_json()

# convert the object into a dict
price_filter_price_dict = price_filter_price_instance.to_dict()
# create an instance of PriceFilterPrice from a dict
price_filter_price_from_dict = PriceFilterPrice.from_dict(price_filter_price_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


