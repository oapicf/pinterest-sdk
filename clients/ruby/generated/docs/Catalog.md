# PinterestSdkClient::Catalog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **created_at** | **Time** |  | [readonly] |
| **id** | **String** | ID of the catalog entity. |  |
| **name** | **String** | A human-friendly name associated to a catalog entity. |  |
| **updated_at** | **Time** |  | [readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Catalog.new(
  catalog_type: null,
  created_at: 2022-03-14T15:15:22Z,
  id: 864344156814050986,
  name: null,
  updated_at: 2022-03-14T15:16:34Z
)
```

