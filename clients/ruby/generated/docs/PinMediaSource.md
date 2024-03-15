# PinterestSdkClient::PinMediaSource

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaSource.openapi_one_of
# =>
# [
#   :'PinMediaSourceImageBase64',
#   :'PinMediaSourceImageURL',
#   :'PinMediaSourceImagesBase64',
#   :'PinMediaSourceImagesURL',
#   :'PinMediaSourcePinURL',
#   :'PinMediaSourceVideoID'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaSource.openapi_discriminator_name
# => :'source_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaSource.openapi_discriminator_mapping
# =>
# {
#   :'image_base64' => :'PinMediaSourceImageBase64',
#   :'image_url' => :'PinMediaSourceImageURL',
#   :'multiple_image_base64' => :'PinMediaSourceImagesBase64',
#   :'multiple_image_urls' => :'PinMediaSourceImagesURL',
#   :'pin_url' => :'PinMediaSourcePinURL',
#   :'video_id' => :'PinMediaSourceVideoID'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::PinMediaSource.build(data)
# => #<PinMediaSourceImageBase64:0x00007fdd4aab02a0>

PinterestSdkClient::PinMediaSource.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `PinMediaSourceImageBase64`
- `PinMediaSourceImageURL`
- `PinMediaSourceImagesBase64`
- `PinMediaSourceImagesURL`
- `PinMediaSourcePinURL`
- `PinMediaSourceVideoID`
- `nil` (if no type matches)

