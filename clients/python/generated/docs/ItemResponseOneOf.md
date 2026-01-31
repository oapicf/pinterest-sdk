# ItemResponseOneOf

Successful item response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**item_id** | **str** | The catalog retail item id in the merchant namespace | [optional] 
**pins** | [**List[Pin]**](Pin.md) | The pins mapped to the item | [optional] 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | [optional] 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | [optional] 

## Example

```python
from pinterestsdk.models.item_response_one_of import ItemResponseOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of ItemResponseOneOf from a JSON string
item_response_one_of_instance = ItemResponseOneOf.from_json(json)
# print the JSON string representation of the object
print(ItemResponseOneOf.to_json())

# convert the object into a dict
item_response_one_of_dict = item_response_one_of_instance.to_dict()
# create an instance of ItemResponseOneOf from a dict
item_response_one_of_from_dict = ItemResponseOneOf.from_dict(item_response_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


