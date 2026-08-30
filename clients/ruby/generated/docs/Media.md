# PinterestSdkClient::Media

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media_id** | **String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] |
| **media_type** | [**MediaUploadType**](MediaUploadType.md) |  |  |
| **status** | [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Media.new(
  media_id: 12345,
  media_type: video,
  status: null
)
```

