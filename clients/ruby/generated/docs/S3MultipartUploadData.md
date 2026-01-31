# PinterestSdkClient::S3MultipartUploadData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_parts** | [**Array&lt;S3FilePart&gt;**](S3FilePart.md) | Array of file parts with pre-signed URLs. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::S3MultipartUploadData.new(
  file_parts: null
)
```

