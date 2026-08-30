# AdAccount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] 
**created_time** | **int** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**id** | **str** |  | 
**name** | **str** | Ad account name. | [optional] 
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**permissions** | [**List[BusinessAccessRole]**](BusinessAccessRole.md) |  | [optional] [readonly] 
**time_zone** | **str** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 
**updated_time** | **int** |  | [optional] [readonly] 

## Example

```python
from openapi_client.models.ad_account import AdAccount

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccount from a JSON string
ad_account_instance = AdAccount.from_json(json)
# print the JSON string representation of the object
print AdAccount.to_json()

# convert the object into a dict
ad_account_dict = ad_account_instance.to_dict()
# create an instance of AdAccount from a dict
ad_account_from_dict = AdAccount.from_dict(ad_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


