# PinterestSdkClient::CatalogsItemsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **filters** | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  |  |
| **language** | **String** | We recommend using the CatalogsLocale values. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemsRequest.new(
  country: null,
  filters: null,
  language: null
)
```

