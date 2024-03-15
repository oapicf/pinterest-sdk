# PinterestSdkClient::ItemBatchRecord

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemBatchRecord.openapi_one_of
# =>
# [
#   :'ItemCreateBatchRecord',
#   :'ItemDeleteBatchRecord',
#   :'ItemDeleteDiscontinuedBatchRecord',
#   :'ItemUpdateBatchRecord',
#   :'ItemUpsertBatchRecord'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::ItemBatchRecord.build(data)
# => #<ItemCreateBatchRecord:0x00007fdd4aab02a0>

PinterestSdkClient::ItemBatchRecord.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ItemCreateBatchRecord`
- `ItemDeleteBatchRecord`
- `ItemDeleteDiscontinuedBatchRecord`
- `ItemUpdateBatchRecord`
- `ItemUpsertBatchRecord`
- `nil` (if no type matches)

