# PinterestSdkClient::CatalogsRetailProductGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the retail product group. |  |
| **catalog_type** | **String** |  |  |
| **country** | **String** |  | [optional] |
| **created_at** | **Integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] |
| **description** | **String** |  | [optional] |
| **feed_id** | **String** | id of the catalogs feed belonging to this catalog product group |  |
| **filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
| **id** | **String** | ID of the catalog product group. |  |
| **is_featured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] |
| **locale** | **String** |  | [optional] |
| **name** | **String** | Name of catalog product group | [optional] |
| **status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] |
| **type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  |  |
| **updated_at** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailProductGroup.new(
  catalog_id: null,
  catalog_type: null,
  country: null,
  created_at: 1621350033000,
  description: null,
  feed_id: 2680059592705,
  filters: null,
  id: 443727193917,
  is_featured: null,
  locale: null,
  name: Most Popular,
  status: null,
  type: null,
  updated_at: 1622742155000
)
```

