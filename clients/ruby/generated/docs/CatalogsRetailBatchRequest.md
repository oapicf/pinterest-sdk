# PinterestSdkClient::CatalogsRetailBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**Language**](Language.md) |  |  |
| **items** | [**Array&lt;CatalogsRetailBatchRequestItemsInner&gt;**](CatalogsRetailBatchRequestItemsInner.md) | Array with catalogs item operations |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailBatchRequest.new(
  catalog_type: null,
  country: null,
  language: null,
  items: null
)
```

