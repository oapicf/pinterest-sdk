# AdAccountsSubscriptionsGetList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[LeadSubscription]**](LeadSubscription.md) |  | 

## Example

```python
from openapi_client.models.ad_accounts_subscriptions_get_list200_response import AdAccountsSubscriptionsGetList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsSubscriptionsGetList200Response from a JSON string
ad_accounts_subscriptions_get_list200_response_instance = AdAccountsSubscriptionsGetList200Response.from_json(json)
# print the JSON string representation of the object
print AdAccountsSubscriptionsGetList200Response.to_json()

# convert the object into a dict
ad_accounts_subscriptions_get_list200_response_dict = ad_accounts_subscriptions_get_list200_response_instance.to_dict()
# create an instance of AdAccountsSubscriptionsGetList200Response from a dict
ad_accounts_subscriptions_get_list200_response_from_dict = AdAccountsSubscriptionsGetList200Response.from_dict(ad_accounts_subscriptions_get_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


