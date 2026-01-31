# CatalogsFeedVideoCounts

Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ingested_videos** | **int** | The number of videos successfully ingested from the feed file. | [optional] 
**not_ingested_videos** | **int** | The number of videos that were not ingested from the feed file. | [optional] 
**total_videos** | **int** | The number of videos in the feed file. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_feed_video_counts import CatalogsFeedVideoCounts

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedVideoCounts from a JSON string
catalogs_feed_video_counts_instance = CatalogsFeedVideoCounts.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedVideoCounts.to_json())

# convert the object into a dict
catalogs_feed_video_counts_dict = catalogs_feed_video_counts_instance.to_dict()
# create an instance of CatalogsFeedVideoCounts from a dict
catalogs_feed_video_counts_from_dict = CatalogsFeedVideoCounts.from_dict(catalogs_feed_video_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


