# BulkCampaignDeliveryEstimatesResponse

Bulk campaign delivery estimates response.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[BulkCampaignDeliveryEstimatesItem]**](BulkCampaignDeliveryEstimatesItem.md) | Per-campaign delivery estimate results, in the same order as the request. | 

## Example

```python
from openapi_client.models.bulk_campaign_delivery_estimates_response import BulkCampaignDeliveryEstimatesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BulkCampaignDeliveryEstimatesResponse from a JSON string
bulk_campaign_delivery_estimates_response_instance = BulkCampaignDeliveryEstimatesResponse.from_json(json)
# print the JSON string representation of the object
print BulkCampaignDeliveryEstimatesResponse.to_json()

# convert the object into a dict
bulk_campaign_delivery_estimates_response_dict = bulk_campaign_delivery_estimates_response_instance.to_dict()
# create an instance of BulkCampaignDeliveryEstimatesResponse from a dict
bulk_campaign_delivery_estimates_response_from_dict = BulkCampaignDeliveryEstimatesResponse.from_dict(bulk_campaign_delivery_estimates_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


