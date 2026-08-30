# PinterestSdkClient::CatalogsRetailItemsBatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of the catalogs items batch | [optional] |
| **catalog_type** | **String** |  |  |
| **completed_time** | **Time** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] |
| **created_time** | **Time** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. |  |
| **items** | [**Array&lt;ItemProcessingRecord&gt;**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] |
| **status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailItemsBatch.new(
  batch_id: 595953100599279259,
  catalog_type: null,
  completed_time: 2024-01-01T20:20Z,
  created_time: 2024-01-01T20:10:40Z,
  items: null,
  status: null
)
```

