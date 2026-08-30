# AdAccountsAudienceCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**description** | **str** | Audience description. | [optional] 
**name** | **str** | Audience name. | [optional] 
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_accounts_audience_create import AdAccountsAudienceCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsAudienceCreate from a JSON string
ad_accounts_audience_create_instance = AdAccountsAudienceCreate.from_json(json)
# print the JSON string representation of the object
print(AdAccountsAudienceCreate.to_json())

# convert the object into a dict
ad_accounts_audience_create_dict = ad_accounts_audience_create_instance.to_dict()
# create an instance of AdAccountsAudienceCreate from a dict
ad_accounts_audience_create_from_dict = AdAccountsAudienceCreate.from_dict(ad_accounts_audience_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


