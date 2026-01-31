# PinterestSdkClient::CatalogsFeedVideoCounts

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ingested_videos** | **Integer** | The number of videos successfully ingested from the feed file. | [optional] |
| **not_ingested_videos** | **Integer** | The number of videos that were not ingested from the feed file. | [optional] |
| **total_videos** | **Integer** | The number of videos in the feed file. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedVideoCounts.new(
  ingested_videos: null,
  not_ingested_videos: null,
  total_videos: null
)
```

