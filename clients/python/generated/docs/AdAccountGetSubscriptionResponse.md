# AdAccountGetSubscriptionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **str** | Lead form ID. | [optional] 
**webhook_url** | **str** | Standard HTTPS webhook URL. | [optional] 
**ad_account_id** | **str** | The Ad Account ID that this lead form belongs to. | [optional] 
**api_version** | **str** | API version. | [optional] 
**created_time** | **int** | Lead subscription creation time. Unix timestamp in milliseconds. | [optional] 
**cryptographic_algorithm** | **str** | Lead data encryption algorithm. | [optional] 
**cryptographic_key** | **str** | Base64 encoded key for client to decrypt lead data. | [optional] 
**id** | **str** | Subscription ID. | [optional] 
**user_account_id** | **str** | User account used to subscribe lead data. | [optional] 

## Example

```python
from pinterestsdk.models.ad_account_get_subscription_response import AdAccountGetSubscriptionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountGetSubscriptionResponse from a JSON string
ad_account_get_subscription_response_instance = AdAccountGetSubscriptionResponse.from_json(json)
# print the JSON string representation of the object
print(AdAccountGetSubscriptionResponse.to_json())

# convert the object into a dict
ad_account_get_subscription_response_dict = ad_account_get_subscription_response_instance.to_dict()
# create an instance of AdAccountGetSubscriptionResponse from a dict
ad_account_get_subscription_response_from_dict = AdAccountGetSubscriptionResponse.from_dict(ad_account_get_subscription_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


