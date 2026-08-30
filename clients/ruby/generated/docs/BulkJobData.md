# PinterestSdkClient::BulkJobData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result_url** | **String** | Presigned s3 file url for the bulk request result. | [optional] |
| **status** | [**BulkRequestStatus**](BulkRequestStatus.md) |  |  |
| **workload_id** | **Integer** | Bulk Workload Id. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkJobData.new(
  result_url: null,
  status: null,
  workload_id: null
)
```

