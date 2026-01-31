# PinterestSdkClient::MediaUpload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **media_id** | **String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] |
| **media_type** | [**MediaUploadType**](MediaUploadType.md) |  |  |
| **upload_parameters** | [**MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional][readonly] |
| **upload_url** | **String** | The URL where you will POST your media file. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MediaUpload.new(
  media_id: 12345,
  media_type: null,
  upload_parameters: null,
  upload_url: https://pinterest-media-upload.s3-accelerate.amazonaws.com/
)
```

