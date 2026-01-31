# PinterestSdkClient::CatalogsCreativeAssetsItemsPostFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] |
| **catalog_type** | **String** |  |  |
| **creative_assets_ids** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsItemsPostFilter.new(
  catalog_id: null,
  catalog_type: null,
  creative_assets_ids: null
)
```

