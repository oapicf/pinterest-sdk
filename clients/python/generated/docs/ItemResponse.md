# ItemResponse

Object describing an item record or error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 
**pins** | [**List[Pin]**](Pin.md) | The pins mapped to the item | [optional] 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | [optional] 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 

## Example

```python
from pinterestsdk.models.item_response import ItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ItemResponse from a JSON string
item_response_instance = ItemResponse.from_json(json)
# print the JSON string representation of the object
print(ItemResponse.to_json())

# convert the object into a dict
item_response_dict = item_response_instance.to_dict()
# create an instance of ItemResponse from a dict
item_response_from_dict = ItemResponse.from_dict(item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


