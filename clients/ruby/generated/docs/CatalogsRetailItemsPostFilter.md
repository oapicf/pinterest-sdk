# PinterestSdkClient::CatalogsRetailItemsPostFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **item_ids** | **Array&lt;String&gt;** |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailItemsPostFilter.new(
  catalog_type: null,
  item_ids: null,
  catalog_id: null
)
```

