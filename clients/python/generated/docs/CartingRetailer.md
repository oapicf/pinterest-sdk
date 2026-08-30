# CartingRetailer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retailer_id** | **str** | Unique identifier for the retailer | 
**retailer_name** | **str** | Name of the retailer | 

## Example

```python
from pinterestsdk.models.carting_retailer import CartingRetailer

# TODO update the JSON string below
json = "{}"
# create an instance of CartingRetailer from a JSON string
carting_retailer_instance = CartingRetailer.from_json(json)
# print the JSON string representation of the object
print(CartingRetailer.to_json())

# convert the object into a dict
carting_retailer_dict = carting_retailer_instance.to_dict()
# create an instance of CartingRetailer from a dict
carting_retailer_from_dict = CartingRetailer.from_dict(carting_retailer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


