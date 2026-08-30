# AdAccountCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**name** | **str** | Ad account name. | [optional] 
**owner_user_id** | **str** | Advertiser&#39;s owning user ID. | [optional] 
**time_zone** | **str** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 

## Example

```python
from openapi_client.models.ad_account_create import AdAccountCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountCreate from a JSON string
ad_account_create_instance = AdAccountCreate.from_json(json)
# print the JSON string representation of the object
print AdAccountCreate.to_json()

# convert the object into a dict
ad_account_create_dict = ad_account_create_instance.to_dict()
# create an instance of AdAccountCreate from a dict
ad_account_create_from_dict = AdAccountCreate.from_dict(ad_account_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


