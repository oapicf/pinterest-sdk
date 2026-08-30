# PromotionsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Promotion]**](Promotion.md) |  | 

## Example

```python
from pinterestsdk.models.promotions_list200_response import PromotionsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of PromotionsList200Response from a JSON string
promotions_list200_response_instance = PromotionsList200Response.from_json(json)
# print the JSON string representation of the object
print(PromotionsList200Response.to_json())

# convert the object into a dict
promotions_list200_response_dict = promotions_list200_response_instance.to_dict()
# create an instance of PromotionsList200Response from a dict
promotions_list200_response_from_dict = PromotionsList200Response.from_dict(promotions_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


