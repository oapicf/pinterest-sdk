# PinterestSdkClient::CatalogsCreativeAssetsBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  |  |
| **items** | [**Array&lt;CatalogsCreativeAssetsBatchItem&gt;**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations |  |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsBatchRequest.new(
  catalog_type: null,
  country: null,
  language: null,
  items: null,
  catalog_id: 2680059592705
)
```

