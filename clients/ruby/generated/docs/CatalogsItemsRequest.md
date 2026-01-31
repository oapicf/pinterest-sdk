# PinterestSdkClient::CatalogsItemsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **language** | **String** | We recommend using the CatalogsLocale values. |  |
| **filters** | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemsRequest.new(
  country: null,
  language: null,
  filters: null
)
```

