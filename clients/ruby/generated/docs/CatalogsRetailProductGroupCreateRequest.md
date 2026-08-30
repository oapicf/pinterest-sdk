# PinterestSdkClient::CatalogsRetailProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog ID pertaining to the product group. |  |
| **catalog_type** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
| **country** | [**Country**](Country.md) |  | [optional] |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  |
| **locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] |
| **name** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailProductGroupCreateRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  country: null,
  description: null,
  filters: null,
  locale: null,
  name: null
)
```

