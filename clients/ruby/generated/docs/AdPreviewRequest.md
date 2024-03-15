# PinterestSdkClient::AdPreviewRequest

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::AdPreviewRequest.openapi_one_of
# =>
# [
#   :'AdPreviewCreateFromImage',
#   :'AdPreviewCreateFromPin'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::AdPreviewRequest.build(data)
# => #<AdPreviewCreateFromImage:0x00007fdd4aab02a0>

PinterestSdkClient::AdPreviewRequest.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `AdPreviewCreateFromImage`
- `AdPreviewCreateFromPin`
- `nil` (if no type matches)

