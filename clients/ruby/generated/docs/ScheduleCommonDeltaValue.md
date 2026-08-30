# PinterestSdkClient::ScheduleCommonDeltaValue

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ScheduleCommonDeltaValue.openapi_one_of
# =>
# [
#   :'ScheduleBidOptions',
#   :'String'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ScheduleCommonDeltaValue.build(data)
# => #<ScheduleBidOptions:0x00007fdd4aab02a0>

PinterestSdkClient::ScheduleCommonDeltaValue.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ScheduleBidOptions`
- `String`
- `nil` (if no type matches)

