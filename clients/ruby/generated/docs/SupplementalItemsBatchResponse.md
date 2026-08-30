# PinterestSdkClient::SupplementalItemsBatchResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of the batch operation | [readonly] |
| **completed_time** | **Time** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional][readonly] |
| **created_time** | **Time** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] |
| **operation_results** | [**Array&lt;SupplementalOperationResult&gt;**](SupplementalOperationResult.md) | Array of operation results | [readonly] |
| **status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SupplementalItemsBatchResponse.new(
  batch_id: 66753b9bb65c46c49bd,
  completed_time: 2022-03-14T15:16:34Z,
  created_time: 2022-03-14T15:15:22Z,
  operation_results: null,
  status: null
)
```

