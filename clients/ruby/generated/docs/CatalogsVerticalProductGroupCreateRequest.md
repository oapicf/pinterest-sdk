# PinterestSdkClient::CatalogsVerticalProductGroupCreateRequest

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalProductGroupCreateRequest.openapi_one_of
# =>
# [
#   :'CatalogsCreativeAssetsProductGroupCreateRequest',
#   :'CatalogsHotelProductGroupCreateRequest',
#   :'CatalogsRetailProductGroupCreateRequest'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalProductGroupCreateRequest.openapi_discriminator_name
# => :'catalog_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalProductGroupCreateRequest.openapi_discriminator_mapping
# =>
# {
#   :'CREATIVE_ASSETS' => :'CatalogsCreativeAssetsProductGroupCreateRequest',
#   :'HOTEL' => :'CatalogsHotelProductGroupCreateRequest',
#   :'RETAIL' => :'CatalogsRetailProductGroupCreateRequest'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalProductGroupCreateRequest.build(data)
# => #<CatalogsCreativeAssetsProductGroupCreateRequest:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsVerticalProductGroupCreateRequest.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreativeAssetsProductGroupCreateRequest`
- `CatalogsHotelProductGroupCreateRequest`
- `CatalogsRetailProductGroupCreateRequest`
- `nil` (if no type matches)

