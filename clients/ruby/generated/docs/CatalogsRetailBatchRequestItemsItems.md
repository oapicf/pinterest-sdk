# PinterestSdkClient::CatalogsRetailBatchRequestItemsItems

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsRetailBatchRequestItemsItems.openapi_one_of
# =>
# [
#   :'CatalogsCreateRetailItem',
#   :'CatalogsDeleteRetailItem',
#   :'CatalogsUpdateRetailItem',
#   :'CatalogsUpsertRetailItem'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsRetailBatchRequestItemsItems.openapi_discriminator_name
# => :'operation'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsRetailBatchRequestItemsItems.openapi_discriminator_mapping
# =>
# {
#   :'CREATE' => :'CatalogsCreateRetailItem',
#   :'DELETE' => :'CatalogsDeleteRetailItem',
#   :'UPDATE' => :'CatalogsUpdateRetailItem',
#   :'UPSERT' => :'CatalogsUpsertRetailItem'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsRetailBatchRequestItemsItems.build(data)
# => #<CatalogsCreateRetailItem:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsRetailBatchRequestItemsItems.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsCreateRetailItem`
- `CatalogsDeleteRetailItem`
- `CatalogsUpdateRetailItem`
- `CatalogsUpsertRetailItem`
- `nil` (if no type matches)

