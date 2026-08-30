# CampaignUpdateRequestAllOf2


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  | [optional] 
**intended_promotion_type** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**is_ltv_optimized** | **bool** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**is_performance_plus** | **bool** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**is_top_of_search** | **bool** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 

## Example

```python
from openapi_client.models.campaign_update_request_all_of2 import CampaignUpdateRequestAllOf2

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignUpdateRequestAllOf2 from a JSON string
campaign_update_request_all_of2_instance = CampaignUpdateRequestAllOf2.from_json(json)
# print the JSON string representation of the object
print CampaignUpdateRequestAllOf2.to_json()

# convert the object into a dict
campaign_update_request_all_of2_dict = campaign_update_request_all_of2_instance.to_dict()
# create an instance of CampaignUpdateRequestAllOf2 from a dict
campaign_update_request_all_of2_from_dict = CampaignUpdateRequestAllOf2.from_dict(campaign_update_request_all_of2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


