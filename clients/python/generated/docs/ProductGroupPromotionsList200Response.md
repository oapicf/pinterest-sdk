# ProductGroupPromotionsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[ProductGroupPromotion]**](ProductGroupPromotion.md) |  | 

## Example

```python
from pinterestsdk.models.product_group_promotions_list200_response import ProductGroupPromotionsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotionsList200Response from a JSON string
product_group_promotions_list200_response_instance = ProductGroupPromotionsList200Response.from_json(json)
# print the JSON string representation of the object
print(ProductGroupPromotionsList200Response.to_json())

# convert the object into a dict
product_group_promotions_list200_response_dict = product_group_promotions_list200_response_instance.to_dict()
# create an instance of ProductGroupPromotionsList200Response from a dict
product_group_promotions_list200_response_from_dict = ProductGroupPromotionsList200Response.from_dict(product_group_promotions_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


