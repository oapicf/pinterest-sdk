# ProductGroupPromotionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ProductGroupPromotionResponseItem]**](ProductGroupPromotionResponseItem.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.product_group_promotion_response import ProductGroupPromotionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotionResponse from a JSON string
product_group_promotion_response_instance = ProductGroupPromotionResponse.from_json(json)
# print the JSON string representation of the object
print(ProductGroupPromotionResponse.to_json())

# convert the object into a dict
product_group_promotion_response_dict = product_group_promotion_response_instance.to_dict()
# create an instance of ProductGroupPromotionResponse from a dict
product_group_promotion_response_from_dict = ProductGroupPromotionResponse.from_dict(product_group_promotion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


