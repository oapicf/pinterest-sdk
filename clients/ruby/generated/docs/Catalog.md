# PinterestSdkClient::Catalog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  |  |
| **id** | **String** | ID of the catalog entity. |  |
| **updated_at** | **Time** |  |  |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **name** | **String** | A human-friendly name associated to a catalog entity. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Catalog.new(
  created_at: 2022-03-14T15:15:22Z,
  id: 864344156814050986,
  updated_at: 2022-03-14T15:16:34Z,
  catalog_type: null,
  name: null
)
```

