# ItemResponseOneOf1

Error item response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) |  | 
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | [optional] 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | [optional] 

## Example

```python
from pinterestsdk.models.item_response_one_of1 import ItemResponseOneOf1

# TODO update the JSON string below
json = "{}"
# create an instance of ItemResponseOneOf1 from a JSON string
item_response_one_of1_instance = ItemResponseOneOf1.from_json(json)
# print the JSON string representation of the object
print(ItemResponseOneOf1.to_json())

# convert the object into a dict
item_response_one_of1_dict = item_response_one_of1_instance.to_dict()
# create an instance of ItemResponseOneOf1 from a dict
item_response_one_of1_from_dict = ItemResponseOneOf1.from_dict(item_response_one_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


