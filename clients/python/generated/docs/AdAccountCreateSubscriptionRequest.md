# AdAccountCreateSubscriptionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **str** | Lead form ID. | [optional] 
**partner_access_token** | **str** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partner_metadata** | [**AdAccountCreateSubscriptionRequestPartnerMetadata**](AdAccountCreateSubscriptionRequestPartnerMetadata.md) |  | [optional] 
**partner_refresh_token** | **str** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**webhook_url** | **str** | Standard HTTPS webhook URL. | 

## Example

```python
from pinterestsdk.models.ad_account_create_subscription_request import AdAccountCreateSubscriptionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountCreateSubscriptionRequest from a JSON string
ad_account_create_subscription_request_instance = AdAccountCreateSubscriptionRequest.from_json(json)
# print the JSON string representation of the object
print(AdAccountCreateSubscriptionRequest.to_json())

# convert the object into a dict
ad_account_create_subscription_request_dict = ad_account_create_subscription_request_instance.to_dict()
# create an instance of AdAccountCreateSubscriptionRequest from a dict
ad_account_create_subscription_request_from_dict = AdAccountCreateSubscriptionRequest.from_dict(ad_account_create_subscription_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


