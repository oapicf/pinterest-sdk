# PinterestSdkClient::SchedulesCreate200ResponseInnerData

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::SchedulesCreate200ResponseInnerData.openapi_one_of
# =>
# [
#   :'Schedule',
#   :'SchedulesCreate200ResponseInnerDataOneOf'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::SchedulesCreate200ResponseInnerData.build(data)
# => #<Schedule:0x00007fdd4aab02a0>

PinterestSdkClient::SchedulesCreate200ResponseInnerData.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `Schedule`
- `SchedulesCreate200ResponseInnerDataOneOf`
- `nil` (if no type matches)

