# AdAccountCreateSubscriptionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | The Ad Account ID that this lead form belongs to. | [optional] 
**api_version** | **str** | API version. | [optional] 
**created_time** | **int** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**cryptographic_algorithm** | **str** | Lead data encryption algorithm. | [optional] 
**cryptographic_key** | **str** | Base64 encoded key for client to decrypt lead data. | [optional] 
**id** | **str** | Subscription ID. | [optional] 
**lead_form_id** | **str** | Lead form ID. | [optional] 
**user_account_id** | **str** | User account used to subscribe lead data. | [optional] 
**webhook_url** | **str** | Standard HTTPS webhook URL. | [optional] 

## Example

```python
from pinterestsdk.models.ad_account_create_subscription_response import AdAccountCreateSubscriptionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountCreateSubscriptionResponse from a JSON string
ad_account_create_subscription_response_instance = AdAccountCreateSubscriptionResponse.from_json(json)
# print the JSON string representation of the object
print(AdAccountCreateSubscriptionResponse.to_json())

# convert the object into a dict
ad_account_create_subscription_response_dict = ad_account_create_subscription_response_instance.to_dict()
# create an instance of AdAccountCreateSubscriptionResponse from a dict
ad_account_create_subscription_response_from_dict = AdAccountCreateSubscriptionResponse.from_dict(ad_account_create_subscription_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


