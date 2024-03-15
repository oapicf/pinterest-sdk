# PinterestSdkClient::CatalogsFeedIngestionInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **in_stock** | **Integer** | The number of ingested products that are in stock. | [optional] |
| **out_of_stock** | **Integer** | The number of ingested products that are in out of stock. | [optional] |
| **preorder** | **Integer** | The number of ingested products that are in preorder. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedIngestionInfo.new(
  in_stock: null,
  out_of_stock: null,
  preorder: null
)
```

