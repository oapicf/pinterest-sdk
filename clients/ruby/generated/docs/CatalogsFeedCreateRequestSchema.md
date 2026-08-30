# PinterestSdkClient::CatalogsFeedCreateRequestSchema

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsFeedCreateRequestSchema.openapi_one_of
# =>
# [
#   :'CatalogsFeedsCreateRequest',
#   :'CatalogsVerticalFeedsCreateRequest'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsFeedCreateRequestSchema.build(data)
# => #<CatalogsFeedsCreateRequest:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsFeedCreateRequestSchema.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsFeedsCreateRequest`
- `CatalogsVerticalFeedsCreateRequest`
- `nil` (if no type matches)

