# PinterestSdkClient::NotificationPostRequest

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::NotificationPostRequest.openapi_one_of
# =>
# [
#   :'Array<Hash<String, Object>>',
#   :'Object'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::NotificationPostRequest.build(data)
# => #<Array<Hash<String, Object>>:0x00007fdd4aab02a0>

PinterestSdkClient::NotificationPostRequest.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `Array<Hash<String, Object>>`
- `Object`
- `nil` (if no type matches)

