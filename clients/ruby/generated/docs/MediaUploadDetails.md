# PinterestSdkClient::MediaUploadDetails

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media_id** | **String** |  | [optional][readonly] |
| **media_type** | [**MediaUploadType**](MediaUploadType.md) |  | [optional][readonly] |
| **status** | [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MediaUploadDetails.new(
  media_id: null,
  media_type: null,
  status: null
)
```

