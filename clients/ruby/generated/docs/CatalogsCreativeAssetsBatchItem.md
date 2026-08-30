# PinterestSdkClient::CatalogsCreativeAssetsBatchItem

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsCreativeAssetsBatchItem.openapi_one_of
# =>
# [
#   :'CatalogsCreateCreativeAssetsItem',
#   :'CatalogsDeleteCreativeAssetsItem',
#   :'CatalogsUpdateCreativeAssetsItem',
#   :'CatalogsUpsertCreativeAssetsItem'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsCreativeAssetsBatchItem.openapi_discriminator_name
# => :'operation'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsCreativeAssetsBatchItem.openapi_discriminator_mapping
# =>
# {
#   :'CREATE' => :'CatalogsCreateCreativeAssetsItem',
#   :'DELETE' => :'CatalogsDeleteCreativeAssetsItem',
#   :'UPDATE' => :'CatalogsUpdateCreativeAssetsItem',
#   :'UPSERT' => :'CatalogsUpsertCreativeAssetsItem'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsCreativeAssetsBatchItem.build(data)
# => #<CatalogsCreateCreativeAssetsItem:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsCreativeAssetsBatchItem.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreateCreativeAssetsItem`
- `CatalogsDeleteCreativeAssetsItem`
- `CatalogsUpdateCreativeAssetsItem`
- `CatalogsUpsertCreativeAssetsItem`
- `nil` (if no type matches)

