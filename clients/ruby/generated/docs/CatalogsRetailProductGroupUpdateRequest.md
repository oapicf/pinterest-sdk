# PinterestSdkClient::CatalogsRetailProductGroupUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [optional] |
| **country** | [**Country**](Country.md) |  | [optional] |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] |
| **locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] |
| **name** | **String** | Name of catalog product group | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailProductGroupUpdateRequest.new(
  catalog_type: null,
  country: null,
  description: null,
  filters: null,
  locale: null,
  name: Most Popular
)
```

