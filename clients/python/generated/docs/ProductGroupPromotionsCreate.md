# ProductGroupPromotionsCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | ID of the ad group the product group promotion belongs to. | 
**product_group_promotion** | [**List[ProductGroupPromotion]**](ProductGroupPromotion.md) | List of product group promotions to create or update. | 

## Example

```python
from pinterestsdk.models.product_group_promotions_create import ProductGroupPromotionsCreate

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotionsCreate from a JSON string
product_group_promotions_create_instance = ProductGroupPromotionsCreate.from_json(json)
# print the JSON string representation of the object
print(ProductGroupPromotionsCreate.to_json())

# convert the object into a dict
product_group_promotions_create_dict = product_group_promotions_create_instance.to_dict()
# create an instance of ProductGroupPromotionsCreate from a dict
product_group_promotions_create_from_dict = ProductGroupPromotionsCreate.from_dict(product_group_promotions_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


