# AdsCreditsDiscountsGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[AdsCreditDiscountsResponse]**](AdsCreditDiscountsResponse.md) |  | 

## Example

```python
from openapi_client.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdsCreditsDiscountsGet200Response from a JSON string
ads_credits_discounts_get200_response_instance = AdsCreditsDiscountsGet200Response.from_json(json)
# print the JSON string representation of the object
print AdsCreditsDiscountsGet200Response.to_json()

# convert the object into a dict
ads_credits_discounts_get200_response_dict = ads_credits_discounts_get200_response_instance.to_dict()
# create an instance of AdsCreditsDiscountsGet200Response from a dict
ads_credits_discounts_get200_response_from_dict = AdsCreditsDiscountsGet200Response.from_dict(ads_credits_discounts_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


