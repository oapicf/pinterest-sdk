# PinterestSdkClient::CatalogsItemsCreateBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **items** | [**Array&lt;ItemCreateBatchRecord&gt;**](ItemCreateBatchRecord.md) | Array with catalogs items |  |
| **language** | **String** | We recommend using the CatalogsLocale values. |  |
| **operation** | [**BatchOperation**](BatchOperation.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemsCreateBatchRequest.new(
  country: null,
  items: null,
  language: null,
  operation: null
)
```

