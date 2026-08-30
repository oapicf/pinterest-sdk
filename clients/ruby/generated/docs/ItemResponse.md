# PinterestSdkClient::ItemResponse

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponse.openapi_one_of
# =>
# [
#   :'CatalogsCreativeAssetsItemErrorResponse',
#   :'CatalogsCreativeAssetsItemResponse',
#   :'CatalogsHotelItemErrorResponse',
#   :'CatalogsHotelItemResponse',
#   :'CatalogsRetailItemErrorResponse',
#   :'CatalogsRetailItemResponse'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponse.openapi_discriminator_name
# => :'item_response_kind'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponse.openapi_discriminator_mapping
# =>
# {
#   :'creative_assets_item' => :'CatalogsCreativeAssetsItemResponse',
#   :'creative_assets_item_error' => :'CatalogsCreativeAssetsItemErrorResponse',
#   :'hotel_item' => :'CatalogsHotelItemResponse',
#   :'hotel_item_error' => :'CatalogsHotelItemErrorResponse',
#   :'retail_item' => :'CatalogsRetailItemResponse',
#   :'retail_item_error' => :'CatalogsRetailItemErrorResponse'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemResponse.build(data)
# => #<CatalogsCreativeAssetsItemErrorResponse:0x00007fdd4aab02a0>

PinterestSdkClient::ItemResponse.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreativeAssetsItemErrorResponse`
- `CatalogsCreativeAssetsItemResponse`
- `CatalogsHotelItemErrorResponse`
- `CatalogsHotelItemResponse`
- `CatalogsRetailItemErrorResponse`
- `CatalogsRetailItemResponse`
- `nil` (if no type matches)

