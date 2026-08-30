# AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | 
**operation_type** | [**OperationType**](OperationType.md) |  | 
**recipient_account_ids** | **List[str]** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Example

```python
from openapi_client.models.ad_account_to_ad_account_shared_audience_update_with_required_body import AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody from a JSON string
ad_account_to_ad_account_shared_audience_update_with_required_body_instance = AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.to_json()

# convert the object into a dict
ad_account_to_ad_account_shared_audience_update_with_required_body_dict = ad_account_to_ad_account_shared_audience_update_with_required_body_instance.to_dict()
# create an instance of AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody from a dict
ad_account_to_ad_account_shared_audience_update_with_required_body_from_dict = AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.from_dict(ad_account_to_ad_account_shared_audience_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


