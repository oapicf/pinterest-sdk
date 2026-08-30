# PinterestSdkClient::CampaignAdPreviewDelete200ResponseInnerStatus

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CampaignAdPreviewDelete200ResponseInnerStatus.openapi_one_of
# =>
# [
#   :'PinterestLibError',
#   :'PinterestLibStatus204'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CampaignAdPreviewDelete200ResponseInnerStatus.build(data)
# => #<PinterestLibError:0x00007fdd4aab02a0>

PinterestSdkClient::CampaignAdPreviewDelete200ResponseInnerStatus.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `PinterestLibError`
- `PinterestLibStatus204`
- `nil` (if no type matches)

