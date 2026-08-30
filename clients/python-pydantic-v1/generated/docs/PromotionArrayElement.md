# PromotionArrayElement


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Promotion**](Promotion.md) |  | [optional] 
**exception** | [**Exception**](Exception.md) |  | [optional] 

## Example

```python
from openapi_client.models.promotion_array_element import PromotionArrayElement

# TODO update the JSON string below
json = "{}"
# create an instance of PromotionArrayElement from a JSON string
promotion_array_element_instance = PromotionArrayElement.from_json(json)
# print the JSON string representation of the object
print PromotionArrayElement.to_json()

# convert the object into a dict
promotion_array_element_dict = promotion_array_element_instance.to_dict()
# create an instance of PromotionArrayElement from a dict
promotion_array_element_from_dict = PromotionArrayElement.from_dict(promotion_array_element_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


