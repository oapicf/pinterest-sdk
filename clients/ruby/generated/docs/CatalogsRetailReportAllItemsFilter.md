# PinterestSdkClient::CatalogsRetailReportAllItemsFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] |
| **product_group_id** | **String** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] |
| **report_type** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailReportAllItemsFilter.new(
  catalog_id: null,
  product_group_id: null,
  report_type: null
)
```

