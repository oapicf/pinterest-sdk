# PinterestSdkClient::CustomerListUploadCreateResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_list_upload** | [**CustomerListUpload**](CustomerListUpload.md) | The Customer List Upload created. |  |
| **s3_multipart_upload_data** | [**S3MultipartUploadData**](S3MultipartUploadData.md) | Pre-signed upload URLs corresponding to each part of the upload. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerListUploadCreateResponse.new(
  customer_list_upload: null,
  s3_multipart_upload_data: null
)
```

