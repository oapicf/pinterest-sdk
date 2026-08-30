# ProductGroupPromotionResponseItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**ProductGroupPromotion**](ProductGroupPromotion.md) |  | [optional] 
**exceptions** | [**List[Exception]**](Exception.md) |  | [optional] 

## Example

```python
from openapi_client.models.product_group_promotion_response_item import ProductGroupPromotionResponseItem

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotionResponseItem from a JSON string
product_group_promotion_response_item_instance = ProductGroupPromotionResponseItem.from_json(json)
# print the JSON string representation of the object
print ProductGroupPromotionResponseItem.to_json()

# convert the object into a dict
product_group_promotion_response_item_dict = product_group_promotion_response_item_instance.to_dict()
# create an instance of ProductGroupPromotionResponseItem from a dict
product_group_promotion_response_item_from_dict = ProductGroupPromotionResponseItem.from_dict(product_group_promotion_response_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


