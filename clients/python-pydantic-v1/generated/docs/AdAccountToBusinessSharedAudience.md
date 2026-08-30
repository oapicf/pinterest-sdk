# AdAccountToBusinessSharedAudience


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | 
**permissions** | [**List[Role]**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**recipient_business_ids** | **List[str]** | Business IDs to share with or revoke from (request) / that received the audience (response). | 

## Example

```python
from openapi_client.models.ad_account_to_business_shared_audience import AdAccountToBusinessSharedAudience

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountToBusinessSharedAudience from a JSON string
ad_account_to_business_shared_audience_instance = AdAccountToBusinessSharedAudience.from_json(json)
# print the JSON string representation of the object
print AdAccountToBusinessSharedAudience.to_json()

# convert the object into a dict
ad_account_to_business_shared_audience_dict = ad_account_to_business_shared_audience_instance.to_dict()
# create an instance of AdAccountToBusinessSharedAudience from a dict
ad_account_to_business_shared_audience_from_dict = AdAccountToBusinessSharedAudience.from_dict(ad_account_to_business_shared_audience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


