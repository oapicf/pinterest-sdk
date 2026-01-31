# ProductGroupPromotionUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | ID of the ad group the product group belongs to. | 
**product_group_promotion** | [**List[ProductGroupPromotion]**](ProductGroupPromotion.md) |  | 

## Example

```python
from pinterestsdk.models.product_group_promotion_update_request import ProductGroupPromotionUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotionUpdateRequest from a JSON string
product_group_promotion_update_request_instance = ProductGroupPromotionUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(ProductGroupPromotionUpdateRequest.to_json())

# convert the object into a dict
product_group_promotion_update_request_dict = product_group_promotion_update_request_instance.to_dict()
# create an instance of ProductGroupPromotionUpdateRequest from a dict
product_group_promotion_update_request_from_dict = ProductGroupPromotionUpdateRequest.from_dict(product_group_promotion_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


