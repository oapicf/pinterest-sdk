# PinterestSdkClient::CatalogsCreativeAssetsProductGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog ID pertaining to the product group. |  |
| **catalog_type** | **String** |  |  |
| **created_at** | **Integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  |
| **id** | **String** | ID of the catalog product group. |  |
| **name** | **String** | Name of catalog product group | [optional] |
| **updated_at** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsProductGroup.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  created_at: 1621350033000,
  description: null,
  filters: null,
  id: 443727193917,
  name: Most Popular,
  updated_at: 1622742155000
)
```

