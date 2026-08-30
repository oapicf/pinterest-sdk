# CampaignAdPreviewCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | Ad group ID to create a preview record for. | 

## Example

```python
from openapi_client.models.campaign_ad_preview_create import CampaignAdPreviewCreate

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignAdPreviewCreate from a JSON string
campaign_ad_preview_create_instance = CampaignAdPreviewCreate.from_json(json)
# print the JSON string representation of the object
print CampaignAdPreviewCreate.to_json()

# convert the object into a dict
campaign_ad_preview_create_dict = campaign_ad_preview_create_instance.to_dict()
# create an instance of CampaignAdPreviewCreate from a dict
campaign_ad_preview_create_from_dict = CampaignAdPreviewCreate.from_dict(campaign_ad_preview_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


