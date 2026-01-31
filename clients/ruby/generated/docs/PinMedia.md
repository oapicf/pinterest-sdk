# PinterestSdkClient::PinMedia

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMedia.openapi_one_of
# =>
# [
#   :'PinMediaWithImage',
#   :'PinMediaWithImageAndVideo',
#   :'PinMediaWithImages',
#   :'PinMediaWithVideo',
#   :'PinMediaWithVideos'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMedia.openapi_discriminator_name
# => :'media_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMedia.openapi_discriminator_mapping
# =>
# {
#   :'image' => :'PinMediaWithImage',
#   :'multiple_images' => :'PinMediaWithImages',
#   :'multiple_mixed' => :'PinMediaWithImageAndVideo',
#   :'multiple_videos' => :'PinMediaWithVideos',
#   :'video' => :'PinMediaWithVideo'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMedia.build(data)
# => #<PinMediaWithImage:0x00007fdd4aab02a0>

PinterestSdkClient::PinMedia.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `PinMediaWithImage`
- `PinMediaWithImageAndVideo`
- `PinMediaWithImages`
- `PinMediaWithVideo`
- `PinMediaWithVideos`
- `nil` (if no type matches)

