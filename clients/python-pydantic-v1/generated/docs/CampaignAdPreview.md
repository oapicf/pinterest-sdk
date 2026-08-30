# CampaignAdPreview

Campaign ad preview record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Advertiser ID for this preview. | [readonly] 
**ad_group_id** | **str** | Ad group ID to create a preview record for. | 
**client_id** | **int** | Client ID that created preview. | [optional] [readonly] 
**expires_at** | **int** | Unix timestamp in milliseconds for preview expiration. | [readonly] 
**is_active** | **bool** | Whether preview link is active. | [readonly] 
**pin_id** | **int** | Pin ID for pin promotion preview. | [optional] [readonly] 
**pin_promotion_id** | **int** | Pin promotion ID for this preview. | [optional] [readonly] 
**promoted_product_group_id** | **int** | Promoted product group ID for catalog previews. | [optional] [readonly] 
**url** | **str** | Campaign ad preview URL. | [readonly] 
**user_id** | **int** | User ID that created preview. | [readonly] 
**uuid** | **str** | Pin promotion preview key. | [readonly] 

## Example

```python
from openapi_client.models.campaign_ad_preview import CampaignAdPreview

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignAdPreview from a JSON string
campaign_ad_preview_instance = CampaignAdPreview.from_json(json)
# print the JSON string representation of the object
print CampaignAdPreview.to_json()

# convert the object into a dict
campaign_ad_preview_dict = campaign_ad_preview_instance.to_dict()
# create an instance of CampaignAdPreview from a dict
campaign_ad_preview_from_dict = CampaignAdPreview.from_dict(campaign_ad_preview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


