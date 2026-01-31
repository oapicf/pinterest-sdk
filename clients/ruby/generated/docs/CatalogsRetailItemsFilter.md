# PinterestSdkClient::CatalogsRetailItemsFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] |
| **catalog_type** | **String** |  |  |
| **item_ids** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailItemsFilter.new(
  catalog_id: null,
  catalog_type: null,
  item_ids: null
)
```

