# PinterestSdkClient::CatalogsItemsUpdateBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**Language**](Language.md) |  |  |
| **operation** | [**BatchOperation**](BatchOperation.md) |  |  |
| **items** | [**Array&lt;ItemUpdateBatchRecord&gt;**](ItemUpdateBatchRecord.md) | Array with catalogs items |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemsUpdateBatchRequest.new(
  country: null,
  language: null,
  operation: null,
  items: null
)
```

