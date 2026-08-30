# BusinessToAdAccountSharedAudienceUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | 
**operation_type** | [**OperationType**](OperationType.md) |  | 
**recipient_account_ids** | **List[str]** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Example

```python
from openapi_client.models.business_to_ad_account_shared_audience_update_with_required_body import BusinessToAdAccountSharedAudienceUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessToAdAccountSharedAudienceUpdateWithRequiredBody from a JSON string
business_to_ad_account_shared_audience_update_with_required_body_instance = BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.to_json()

# convert the object into a dict
business_to_ad_account_shared_audience_update_with_required_body_dict = business_to_ad_account_shared_audience_update_with_required_body_instance.to_dict()
# create an instance of BusinessToAdAccountSharedAudienceUpdateWithRequiredBody from a dict
business_to_ad_account_shared_audience_update_with_required_body_from_dict = BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.from_dict(business_to_ad_account_shared_audience_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


