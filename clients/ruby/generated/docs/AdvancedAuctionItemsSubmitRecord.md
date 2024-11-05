# PinterestSdkClient::AdvancedAuctionItemsSubmitRecord

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::AdvancedAuctionItemsSubmitRecord.openapi_one_of
# =>
# [
#   :'AdvancedAuctionItemsSubmitDeleteRecord',
#   :'AdvancedAuctionItemsSubmitUpsertRecord'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::AdvancedAuctionItemsSubmitRecord.openapi_discriminator_name
# => :'operation'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::AdvancedAuctionItemsSubmitRecord.openapi_discriminator_mapping
# =>
# {
#   :'DELETE' => :'AdvancedAuctionItemsSubmitDeleteRecord',
#   :'UPSERT' => :'AdvancedAuctionItemsSubmitUpsertRecord'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::AdvancedAuctionItemsSubmitRecord.build(data)
# => #<AdvancedAuctionItemsSubmitDeleteRecord:0x00007fdd4aab02a0>

PinterestSdkClient::AdvancedAuctionItemsSubmitRecord.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `AdvancedAuctionItemsSubmitDeleteRecord`
- `AdvancedAuctionItemsSubmitUpsertRecord`
- `nil` (if no type matches)

