# AdAccountToBusinessSharedAudienceUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | 
**operation_type** | [**OperationType**](OperationType.md) |  | 
**recipient_business_ids** | **List[str]** | Business IDs to share with or revoke from (request) / that received the audience (response). | 

## Example

```python
from openapi_client.models.ad_account_to_business_shared_audience_update_with_required_body import AdAccountToBusinessSharedAudienceUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountToBusinessSharedAudienceUpdateWithRequiredBody from a JSON string
ad_account_to_business_shared_audience_update_with_required_body_instance = AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.to_json()

# convert the object into a dict
ad_account_to_business_shared_audience_update_with_required_body_dict = ad_account_to_business_shared_audience_update_with_required_body_instance.to_dict()
# create an instance of AdAccountToBusinessSharedAudienceUpdateWithRequiredBody from a dict
ad_account_to_business_shared_audience_update_with_required_body_from_dict = AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.from_dict(ad_account_to_business_shared_audience_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


