# AdAccountsAudience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**created_by_company_name** | **str** | The company that created this audience. | [optional] [readonly] 
**created_timestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**description** | **str** | Audience description. | [optional] 
**id** | **str** | Audience ID. | 
**is_nca** | **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] 
**name** | **str** | Audience name. | [optional] 
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 
**size** | **int** | Audience size. | [optional] [readonly] 
**status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] 
**type** | **str** | Always \&quot;audience\&quot;. | [optional] [readonly] 
**updated_timestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.ad_accounts_audience import AdAccountsAudience

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsAudience from a JSON string
ad_accounts_audience_instance = AdAccountsAudience.from_json(json)
# print the JSON string representation of the object
print(AdAccountsAudience.to_json())

# convert the object into a dict
ad_accounts_audience_dict = ad_accounts_audience_instance.to_dict()
# create an instance of AdAccountsAudience from a dict
ad_accounts_audience_from_dict = AdAccountsAudience.from_dict(ad_accounts_audience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


