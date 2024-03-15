# PinterestSdkClient::CatalogsHotelBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**Language**](Language.md) |  |  |
| **items** | [**Array&lt;CatalogsHotelBatchItem&gt;**](CatalogsHotelBatchItem.md) | Array with catalogs item operations |  |
| **catalog_id** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelBatchRequest.new(
  catalog_type: null,
  country: null,
  language: null,
  items: null,
  catalog_id: 2680059592705
)
```

