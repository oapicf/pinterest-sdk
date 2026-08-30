# AdAccountToAdAccountSharedAudience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | 
**permissions** | [**List[Role]**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**recipient_account_ids** | **List[str]** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Example

```python
from pinterestsdk.models.ad_account_to_ad_account_shared_audience import AdAccountToAdAccountSharedAudience

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountToAdAccountSharedAudience from a JSON string
ad_account_to_ad_account_shared_audience_instance = AdAccountToAdAccountSharedAudience.from_json(json)
# print the JSON string representation of the object
print(AdAccountToAdAccountSharedAudience.to_json())

# convert the object into a dict
ad_account_to_ad_account_shared_audience_dict = ad_account_to_ad_account_shared_audience_instance.to_dict()
# create an instance of AdAccountToAdAccountSharedAudience from a dict
ad_account_to_ad_account_shared_audience_from_dict = AdAccountToAdAccountSharedAudience.from_dict(ad_account_to_ad_account_shared_audience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


