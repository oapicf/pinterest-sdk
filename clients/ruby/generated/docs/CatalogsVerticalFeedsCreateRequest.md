# PinterestSdkClient::CatalogsVerticalFeedsCreateRequest

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalFeedsCreateRequest.openapi_one_of
# =>
# [
#   :'CatalogsCreativeAssetsFeedsCreateRequest',
#   :'CatalogsHotelFeedsCreateRequest',
#   :'CatalogsRetailFeedsCreateRequest'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalFeedsCreateRequest.openapi_discriminator_name
# => :'catalog_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalFeedsCreateRequest.openapi_discriminator_mapping
# =>
# {
#   :'CREATIVE_ASSETS' => :'CatalogsCreativeAssetsFeedsCreateRequest',
#   :'HOTEL' => :'CatalogsHotelFeedsCreateRequest',
#   :'RETAIL' => :'CatalogsRetailFeedsCreateRequest'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsVerticalFeedsCreateRequest.build(data)
# => #<CatalogsCreativeAssetsFeedsCreateRequest:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsVerticalFeedsCreateRequest.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreativeAssetsFeedsCreateRequest`
- `CatalogsHotelFeedsCreateRequest`
- `CatalogsRetailFeedsCreateRequest`
- `nil` (if no type matches)

