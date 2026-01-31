# PinterestSdkClient::CatalogsCreativeAssetsBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] |
| **catalog_type** | **String** |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **items** | [**Array&lt;CatalogsCreativeAssetsBatchItem&gt;**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations |  |
| **language** | **String** | We recommend using the CatalogsLocale values. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsBatchRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  country: null,
  items: null,
  language: null
)
```

