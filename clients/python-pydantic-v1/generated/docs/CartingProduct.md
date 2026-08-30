# CartingProduct


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carting_product_id** | **str** | the internal Pinterest carting product id (different from industry product id) | 
**display_preferred_retailers_only** | **bool** | Whether to display only the preferred retailers for the carting product | [optional] 
**display_product_price** | **bool** | Whether to display the price for the carting product | [optional] 
**preferred_retailers** | [**List[CartingRetailer]**](CartingRetailer.md) | A sorted array of preferred retailers for the carting product | [optional] 
**randomize_preferred_retailers** | **bool** | Whether to randomize preferred retailers for the carting product | [optional] 

## Example

```python
from openapi_client.models.carting_product import CartingProduct

# TODO update the JSON string below
json = "{}"
# create an instance of CartingProduct from a JSON string
carting_product_instance = CartingProduct.from_json(json)
# print the JSON string representation of the object
print CartingProduct.to_json()

# convert the object into a dict
carting_product_dict = carting_product_instance.to_dict()
# create an instance of CartingProduct from a dict
carting_product_from_dict = CartingProduct.from_dict(carting_product_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


