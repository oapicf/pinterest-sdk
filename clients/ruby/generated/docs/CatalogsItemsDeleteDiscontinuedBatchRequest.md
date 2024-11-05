# PinterestSdkClient::CatalogsItemsDeleteDiscontinuedBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  |  |
| **operation** | [**BatchOperation**](BatchOperation.md) |  |  |
| **items** | [**Array&lt;ItemDeleteDiscontinuedBatchRecord&gt;**](ItemDeleteDiscontinuedBatchRecord.md) | Array with catalogs items |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemsDeleteDiscontinuedBatchRequest.new(
  country: null,
  language: null,
  operation: null,
  items: null
)
```

