# ProductGroupPromotionsUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | ID of the ad group the product group promotion belongs to. | 
**product_group_promotion** | [**List[ProductGroupPromotion]**](ProductGroupPromotion.md) | List of product group promotions to create or update. | 

## Example

```python
from openapi_client.models.product_group_promotions_update_with_required_body import ProductGroupPromotionsUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotionsUpdateWithRequiredBody from a JSON string
product_group_promotions_update_with_required_body_instance = ProductGroupPromotionsUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print ProductGroupPromotionsUpdateWithRequiredBody.to_json()

# convert the object into a dict
product_group_promotions_update_with_required_body_dict = product_group_promotions_update_with_required_body_instance.to_dict()
# create an instance of ProductGroupPromotionsUpdateWithRequiredBody from a dict
product_group_promotions_update_with_required_body_from_dict = ProductGroupPromotionsUpdateWithRequiredBody.from_dict(product_group_promotions_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


