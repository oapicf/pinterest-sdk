# PinterestSdkClient::ItemResponseAnyOf

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponseAnyOf.openapi_one_of
# =>
# [
#   :'CatalogsCreativeAssetsItemResponse',
#   :'CatalogsHotelItemResponse',
#   :'CatalogsRetailItemResponse'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponseAnyOf.openapi_discriminator_name
# => :'catalog_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponseAnyOf.openapi_discriminator_mapping
# =>
# {
#   :'CREATIVE_ASSETS' => :'CatalogsCreativeAssetsItemResponse',
#   :'HOTEL' => :'CatalogsHotelItemResponse',
#   :'RETAIL' => :'CatalogsRetailItemResponse'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponseAnyOf.build(data)
# => #<CatalogsCreativeAssetsItemResponse:0x00007fdd4aab02a0>

PinterestSdkClient::ItemResponseAnyOf.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreativeAssetsItemResponse`
- `CatalogsHotelItemResponse`
- `CatalogsRetailItemResponse`
- `nil` (if no type matches)

