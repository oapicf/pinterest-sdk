# PinterestSdkClient::CatalogsItemsBatch

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatch.openapi_one_of
# =>
# [
#   :'CatalogsCreativeAssetsItemsBatch',
#   :'CatalogsHotelItemsBatch',
#   :'CatalogsRetailItemsBatch'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatch.openapi_discriminator_name
# => :'catalog_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatch.openapi_discriminator_mapping
# =>
# {
#   :'CREATIVE_ASSETS' => :'CatalogsCreativeAssetsItemsBatch',
#   :'HOTEL' => :'CatalogsHotelItemsBatch',
#   :'RETAIL' => :'CatalogsRetailItemsBatch'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatch.build(data)
# => #<CatalogsCreativeAssetsItemsBatch:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsItemsBatch.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreativeAssetsItemsBatch`
- `CatalogsHotelItemsBatch`
- `CatalogsRetailItemsBatch`
- `nil` (if no type matches)

