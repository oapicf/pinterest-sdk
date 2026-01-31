# PinterestSdkClient::S3FilePart

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **part_number** | **Integer** | Part number for upload. |  |
| **presigned_url** | **String** | Pre-signed URL. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::S3FilePart.new(
  part_number: 1,
  presigned_url: null
)
```

