# PinterestSdkClient::CatalogsHotelBatchItem

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelBatchItem.openapi_one_of
# =>
# [
#   :'CatalogsCreateHotelItem',
#   :'CatalogsDeleteHotelItem',
#   :'CatalogsUpdateHotelItem',
#   :'CatalogsUpsertHotelItem'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelBatchItem.openapi_discriminator_name
# => :'operation'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelBatchItem.openapi_discriminator_mapping
# =>
# {
#   :'CREATE' => :'CatalogsCreateHotelItem',
#   :'DELETE' => :'CatalogsDeleteHotelItem',
#   :'UPDATE' => :'CatalogsUpdateHotelItem',
#   :'UPSERT' => :'CatalogsUpsertHotelItem'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelBatchItem.build(data)
# => #<CatalogsCreateHotelItem:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsHotelBatchItem.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreateHotelItem`
- `CatalogsDeleteHotelItem`
- `CatalogsUpdateHotelItem`
- `CatalogsUpsertHotelItem`
- `nil` (if no type matches)

