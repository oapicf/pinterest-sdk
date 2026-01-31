# PinterestSdkClient::CatalogsReportAllItemsFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] |
| **report_type** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsReportAllItemsFilter.new(
  catalog_id: null,
  report_type: null
)
```

