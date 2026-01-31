# PinterestSdkClient::CatalogsRetailBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] |
| **catalog_type** | **String** |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **items** | [**Array&lt;CatalogsRetailBatchRequestItemsInner&gt;**](CatalogsRetailBatchRequestItemsInner.md) | Array with catalogs item operations |  |
| **language** | **String** | We recommend using the CatalogsLocale values. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailBatchRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  country: null,
  items: null,
  language: null
)
```

