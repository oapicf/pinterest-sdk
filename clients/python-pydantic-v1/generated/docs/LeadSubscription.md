# LeadSubscription


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
from openapi_client.models.lead_subscription import LeadSubscription

# TODO update the JSON string below
json = "{}"
# create an instance of LeadSubscription from a JSON string
lead_subscription_instance = LeadSubscription.from_json(json)
# print the JSON string representation of the object
print LeadSubscription.to_json()

# convert the object into a dict
lead_subscription_dict = lead_subscription_instance.to_dict()
# create an instance of LeadSubscription from a dict
lead_subscription_from_dict = LeadSubscription.from_dict(lead_subscription_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


