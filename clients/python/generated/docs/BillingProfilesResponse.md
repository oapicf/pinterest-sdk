# BillingProfilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **str** | Advertiser ID of the billing. | [optional] 
**billing_type** | **str** | Billing type of the advertiser | [optional] 
**card_type** | **str** | Type of the card. | [optional] 
**id** | **str** | Billing ID. | [optional] 
**payment_method_brand** | **str** | Brand of the payment method. | [optional] 
**status** | **str** | Status of the billing. | [optional] 

## Example

```python
from pinterestsdk.models.billing_profiles_response import BillingProfilesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BillingProfilesResponse from a JSON string
billing_profiles_response_instance = BillingProfilesResponse.from_json(json)
# print the JSON string representation of the object
print(BillingProfilesResponse.to_json())

# convert the object into a dict
billing_profiles_response_dict = billing_profiles_response_instance.to_dict()
# create an instance of BillingProfilesResponse from a dict
billing_profiles_response_from_dict = BillingProfilesResponse.from_dict(billing_profiles_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


