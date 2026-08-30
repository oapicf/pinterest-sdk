# AdAccountsAudienceUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**description** | **str** | Audience description. | [optional] 
**name** | **str** | Audience name. | [optional] 
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) | Audience operation type (update or remove). Only valid in update request body. | [optional] 
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_accounts_audience_update import AdAccountsAudienceUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsAudienceUpdate from a JSON string
ad_accounts_audience_update_instance = AdAccountsAudienceUpdate.from_json(json)
# print the JSON string representation of the object
print(AdAccountsAudienceUpdate.to_json())

# convert the object into a dict
ad_accounts_audience_update_dict = ad_accounts_audience_update_instance.to_dict()
# create an instance of AdAccountsAudienceUpdate from a dict
ad_accounts_audience_update_from_dict = AdAccountsAudienceUpdate.from_dict(ad_accounts_audience_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


