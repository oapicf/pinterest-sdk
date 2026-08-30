# PromotionsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promotions** | [**List[PromotionArrayElement]**](PromotionArrayElement.md) |  | [optional] 

## Example

```python
from openapi_client.models.promotions_response import PromotionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PromotionsResponse from a JSON string
promotions_response_instance = PromotionsResponse.from_json(json)
# print the JSON string representation of the object
print PromotionsResponse.to_json()

# convert the object into a dict
promotions_response_dict = promotions_response_instance.to_dict()
# create an instance of PromotionsResponse from a dict
promotions_response_from_dict = PromotionsResponse.from_dict(promotions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


