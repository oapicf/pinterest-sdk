# LeadSubscriptionCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **str** | Lead form ID. | [optional] 
**webhook_url** | **str** | Standard HTTPS webhook URL. | 

## Example

```python
from openapi_client.models.lead_subscription_create import LeadSubscriptionCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LeadSubscriptionCreate from a JSON string
lead_subscription_create_instance = LeadSubscriptionCreate.from_json(json)
# print the JSON string representation of the object
print LeadSubscriptionCreate.to_json()

# convert the object into a dict
lead_subscription_create_dict = lead_subscription_create_instance.to_dict()
# create an instance of LeadSubscriptionCreate from a dict
lead_subscription_create_from_dict = LeadSubscriptionCreate.from_dict(lead_subscription_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


