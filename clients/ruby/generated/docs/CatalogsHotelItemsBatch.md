# PinterestSdkClient::CatalogsHotelItemsBatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of the catalogs items batch | [optional] |
| **created_time** | **Time** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional][readonly] |
| **completed_time** | **Time** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional][readonly] |
| **status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **items** | [**Array&lt;HotelProcessingRecord&gt;**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelItemsBatch.new(
  batch_id: 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e,
  created_time: 2020-01-01T20:10:40Z,
  completed_time: 2022-03-10T15:37:10Z,
  status: null,
  catalog_type: null,
  items: null
)
```

