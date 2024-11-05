# PinterestSdkClient::CatalogsCreativeAssetsItemsBatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of the catalogs items batch | [optional] |
| **created_time** | **Time** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional][readonly] |
| **completed_time** | **Time** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional][readonly] |
| **status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **items** | [**Array&lt;CreativeAssetsProcessingRecord&gt;**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsItemsBatch.new(
  batch_id: 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e,
  created_time: null,
  completed_time: null,
  status: null,
  catalog_type: null,
  items: null
)
```

