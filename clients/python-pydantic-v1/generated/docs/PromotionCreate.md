# PromotionCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_status** | [**DiscountStatus**](DiscountStatus.md) |  | [optional] 
**end_time** | **int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**external_id** | **str** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**platform_type** | **str** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**promotion_code** | **str** | Code that can be used to redeem a promotion. | [optional] 
**promotion_custom_id** | **str** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**promotion_title** | **str** | Internal name for the promotion. | 
**promotion_type** | [**PromotionType**](PromotionType.md) |  | 
**start_time** | **int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**template_values** | [**List[PromotionTemplateValue]**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

## Example

```python
from openapi_client.models.promotion_create import PromotionCreate

# TODO update the JSON string below
json = "{}"
# create an instance of PromotionCreate from a JSON string
promotion_create_instance = PromotionCreate.from_json(json)
# print the JSON string representation of the object
print PromotionCreate.to_json()

# convert the object into a dict
promotion_create_dict = promotion_create_instance.to_dict()
# create an instance of PromotionCreate from a dict
promotion_create_from_dict = PromotionCreate.from_dict(promotion_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


