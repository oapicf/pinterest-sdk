# PinterestSdkClient::CustomerListUploadCreateResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_list_upload** | [**CustomerListUpload**](CustomerListUpload.md) |  |  |
| **s3_multipart_upload_data** | [**S3MultipartUploadData**](S3MultipartUploadData.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerListUploadCreateResponse.new(
  customer_list_upload: null,
  s3_multipart_upload_data: null
)
```

