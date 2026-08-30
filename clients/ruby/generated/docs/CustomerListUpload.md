# PinterestSdkClient::CustomerListUpload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Advertiser ID. |  |
| **creation_time** | **Integer** | Customer List Upload creation_time. Epoch (seconds). |  |
| **customer_list_id** | **String** | ID of the customer list associated with this upload. |  |
| **error_counts** | [**Array&lt;ErrorDetail&gt;**](ErrorDetail.md) | Error counts by error code | [optional] |
| **id** | **String** | Customer List Upload ID. |  |
| **operation** | [**UserListOperationType**](UserListOperationType.md) |  |  |
| **record_counts** | [**RecordCounts**](RecordCounts.md) | Record processing counts | [optional] |
| **state** | [**WorkloadState**](WorkloadState.md) |  |  |
| **updated_time** | **Integer** | Customer List Upload updated_time. Epoch (seconds). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerListUpload.new(
  ad_account_id: 9876543210,
  creation_time: 1728606435,
  customer_list_id: 59854745824,
  error_counts: [{&quot;error_code&quot;:42,&quot;message&quot;:&quot;Invalid email&quot;,&quot;count&quot;:20}],
  id: 1234567890,
  operation: null,
  record_counts: null,
  state: RUNNING,
  updated_time: 1728606435
)
```

