# PinterestSdkClient::CatalogsRetailItemsBatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of the catalogs items batch | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **completed_time** | **Time** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional][readonly] |
| **created_time** | **Time** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | [readonly] |
| **items** | [**Array&lt;ItemProcessingRecord&gt;**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] |
| **status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailItemsBatch.new(
  batch_id: 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e,
  catalog_type: null,
  completed_time: null,
  created_time: null,
  items: null,
  status: null
)
```

