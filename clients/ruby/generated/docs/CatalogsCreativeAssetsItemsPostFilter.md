# PinterestSdkClient::CatalogsCreativeAssetsItemsPostFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **creative_assets_ids** | **Array&lt;String&gt;** |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsItemsPostFilter.new(
  catalog_type: null,
  creative_assets_ids: null,
  catalog_id: null
)
```

