# Audience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**audience_type** | [**PinnerListType**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**created_by_company_name** | **str** | The company that created this audience. | [optional] 
**created_timestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] 
**description** | **str** | Audience description. | [optional] 
**id** | **str** | Audience ID. | [optional] 
**is_nca** | **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] 
**name** | **str** | Audience name. | [optional] 
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**size** | **int** | Audience size. | [optional] 
**status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | **str** | Always \&quot;audience\&quot;. | [optional] 
**updated_timestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

## Example

```python
from pinterestsdk.models.audience import Audience

# TODO update the JSON string below
json = "{}"
# create an instance of Audience from a JSON string
audience_instance = Audience.from_json(json)
# print the JSON string representation of the object
print(Audience.to_json())

# convert the object into a dict
audience_dict = audience_instance.to_dict()
# create an instance of Audience from a dict
audience_from_dict = Audience.from_dict(audience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


