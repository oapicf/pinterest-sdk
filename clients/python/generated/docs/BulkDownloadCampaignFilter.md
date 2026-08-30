# BulkDownloadCampaignFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_status** | [**List[SummaryStatus]**](SummaryStatus.md) |  | [optional] 
**end_time** | **str** | Unix UTC timestamp. | [optional] 
**name** | **str** | Campaign name | [optional] 
**objective_type** | [**List[ConversionObjectiveType]**](ConversionObjectiveType.md) |  | [optional] 
**start_time** | **str** | Unix UTC timestamp. | [optional] 

## Example

```python
from pinterestsdk.models.bulk_download_campaign_filter import BulkDownloadCampaignFilter

# TODO update the JSON string below
json = "{}"
# create an instance of BulkDownloadCampaignFilter from a JSON string
bulk_download_campaign_filter_instance = BulkDownloadCampaignFilter.from_json(json)
# print the JSON string representation of the object
print(BulkDownloadCampaignFilter.to_json())

# convert the object into a dict
bulk_download_campaign_filter_dict = bulk_download_campaign_filter_instance.to_dict()
# create an instance of BulkDownloadCampaignFilter from a dict
bulk_download_campaign_filter_from_dict = BulkDownloadCampaignFilter.from_dict(bulk_download_campaign_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


