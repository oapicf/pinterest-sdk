# PinterestSdkClient::PinMediaMetadata

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaMetadata.openapi_one_of
# =>
# [
#   :'ImageMetadata',
#   :'VideoMetadataWithItemType'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaMetadata.openapi_discriminator_name
# => :'item_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaMetadata.openapi_discriminator_mapping
# =>
# {
#   :'image' => :'ImageMetadata',
#   :'video' => :'VideoMetadataWithItemType'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaMetadata.build(data)
# => #<ImageMetadata:0x00007fdd4aab02a0>

PinterestSdkClient::PinMediaMetadata.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ImageMetadata`
- `VideoMetadataWithItemType`
- `nil` (if no type matches)

