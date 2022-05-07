# PinterestSdkClient::CatalogsItemsBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  | [optional] |
| **language** | [**Language**](Language.md) |  | [optional] |
| **operation** | [**BatchOperation**](BatchOperation.md) |  | [optional] |
| **items** | [**Array&lt;ItemBatchRecord&gt;**](ItemBatchRecord.md) | Array with catalogs items | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemsBatchRequest.new(
  country: null,
  language: null,
  operation: null,
  items: null
)
```

