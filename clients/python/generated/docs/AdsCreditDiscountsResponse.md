# AdsCreditDiscountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | True if the offer code is currently active. | [optional] 
**advertiser_id** | **str** | Advertiser ID the offer was applied to. | [optional] 
**discount_currency** | **str** | Currency value for the discount. | [optional] 
**discount_in_micro_currency** | **float** | The discount applied in the offer’s currency value. | [optional] 
**discount_type** | **str** | The type of discount of this credit | [optional] 
**remaining_discount_in_micro_currency** | **float** | The credits left to spend. | [optional] 
**title** | **str** | Human readable title of the offer code. | [optional] 

## Example

```python
from pinterestsdk.models.ads_credit_discounts_response import AdsCreditDiscountsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdsCreditDiscountsResponse from a JSON string
ads_credit_discounts_response_instance = AdsCreditDiscountsResponse.from_json(json)
# print the JSON string representation of the object
print(AdsCreditDiscountsResponse.to_json())

# convert the object into a dict
ads_credit_discounts_response_dict = ads_credit_discounts_response_instance.to_dict()
# create an instance of AdsCreditDiscountsResponse from a dict
ads_credit_discounts_response_from_dict = AdsCreditDiscountsResponse.from_dict(ads_credit_discounts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


