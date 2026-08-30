# PromotionTemplateValue


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** | Numeric value. | [optional] 
**currency_code** | [**Currency**](Currency.md) |  | [optional] 
**custom_text** | **str** | Custom text. | [optional] 
**percent** | **float** | Percent value. | [optional] 

## Example

```python
from openapi_client.models.promotion_template_value import PromotionTemplateValue

# TODO update the JSON string below
json = "{}"
# create an instance of PromotionTemplateValue from a JSON string
promotion_template_value_instance = PromotionTemplateValue.from_json(json)
# print the JSON string representation of the object
print PromotionTemplateValue.to_json()

# convert the object into a dict
promotion_template_value_dict = promotion_template_value_instance.to_dict()
# create an instance of PromotionTemplateValue from a dict
promotion_template_value_from_dict = PromotionTemplateValue.from_dict(promotion_template_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


