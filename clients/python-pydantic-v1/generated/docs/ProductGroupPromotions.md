# ProductGroupPromotions

Wrapper model for ProductGroupPromotion.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ProductGroupPromotionResponseItem]**](ProductGroupPromotionResponseItem.md) | Response-only: created or updated product group promotions, or exceptions. | [optional] [readonly] 

## Example

```python
from openapi_client.models.product_group_promotions import ProductGroupPromotions

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotions from a JSON string
product_group_promotions_instance = ProductGroupPromotions.from_json(json)
# print the JSON string representation of the object
print ProductGroupPromotions.to_json()

# convert the object into a dict
product_group_promotions_dict = product_group_promotions_instance.to_dict()
# create an instance of ProductGroupPromotions from a dict
product_group_promotions_from_dict = ProductGroupPromotions.from_dict(product_group_promotions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


