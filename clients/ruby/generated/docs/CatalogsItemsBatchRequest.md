# PinterestSdkClient::CatalogsItemsBatchRequest

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatchRequest.openapi_one_of
# =>
# [
#   :'CatalogsItemsCreateBatchRequest',
#   :'CatalogsItemsDeleteBatchRequest',
#   :'CatalogsItemsDeleteDiscontinuedBatchRequest',
#   :'CatalogsItemsUpdateBatchRequest',
#   :'CatalogsItemsUpsertBatchRequest'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatchRequest.openapi_discriminator_name
# => :'operation'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatchRequest.openapi_discriminator_mapping
# =>
# {
#   :'CREATE' => :'CatalogsItemsCreateBatchRequest',
#   :'DELETE' => :'CatalogsItemsDeleteBatchRequest',
#   :'DELETE_DISCONTINUED' => :'CatalogsItemsDeleteDiscontinuedBatchRequest',
#   :'UPDATE' => :'CatalogsItemsUpdateBatchRequest',
#   :'UPSERT' => :'CatalogsItemsUpsertBatchRequest'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsItemsBatchRequest.build(data)
# => #<CatalogsItemsCreateBatchRequest:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsItemsBatchRequest.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsItemsCreateBatchRequest`
- `CatalogsItemsDeleteBatchRequest`
- `CatalogsItemsDeleteDiscontinuedBatchRequest`
- `CatalogsItemsUpdateBatchRequest`
- `CatalogsItemsUpsertBatchRequest`
- `nil` (if no type matches)

