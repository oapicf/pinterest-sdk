# PinterestSdkClient::CatalogsItemsUpsertBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**Language**](Language.md) |  |  |
| **operation** | [**BatchOperation**](BatchOperation.md) |  |  |
| **items** | [**Array&lt;ItemUpsertBatchRecord&gt;**](ItemUpsertBatchRecord.md) | Array with catalogs items |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemsUpsertBatchRequest.new(
  country: null,
  language: null,
  operation: null,
  items: null
)
```

