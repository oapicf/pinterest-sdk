# PinterestSdkClient::MediaUpload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media_id** | **String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [optional] |
| **media_type** | [**MediaUploadType**](MediaUploadType.md) |  | [optional] |
| **upload_url** | **String** | The URL where you will POST your media file. | [optional] |
| **upload_parameters** | [**MediaUploadAllOfUploadParameters**](MediaUploadAllOfUploadParameters.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MediaUpload.new(
  media_id: null,
  media_type: video,
  upload_url: https://pinterest-media-upload.s3-accelerate.amazonaws.com/,
  upload_parameters: null
)
```

