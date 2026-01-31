# LeadSubscriptionPostParamsCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **str** | Lead form ID. | [optional] 
**webhook_url** | **str** | Standard HTTPS webhook URL. | 
**partner_access_token** | **str** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partner_metadata** | [**LeadSubscriptionPostParamsCreateAllOfPartnerMetadata**](LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.md) |  | [optional] 
**partner_refresh_token** | **str** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

## Example

```python
from pinterestsdk.models.lead_subscription_post_params_create import LeadSubscriptionPostParamsCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LeadSubscriptionPostParamsCreate from a JSON string
lead_subscription_post_params_create_instance = LeadSubscriptionPostParamsCreate.from_json(json)
# print the JSON string representation of the object
print(LeadSubscriptionPostParamsCreate.to_json())

# convert the object into a dict
lead_subscription_post_params_create_dict = lead_subscription_post_params_create_instance.to_dict()
# create an instance of LeadSubscriptionPostParamsCreate from a dict
lead_subscription_post_params_create_from_dict = LeadSubscriptionPostParamsCreate.from_dict(lead_subscription_post_params_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


