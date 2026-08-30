# PinterestSdkClient::LocalInventoryOperation

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::LocalInventoryOperation.openapi_one_of
# =>
# [
#   :'LocalInventoryCreateOperation',
#   :'LocalInventoryDeleteOperation',
#   :'LocalInventoryUpdateOperation',
#   :'LocalInventoryUpsertOperation'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::LocalInventoryOperation.openapi_discriminator_name
# => :'operation'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::LocalInventoryOperation.openapi_discriminator_mapping
# =>
# {
#   :'CREATE' => :'LocalInventoryCreateOperation',
#   :'DELETE' => :'LocalInventoryDeleteOperation',
#   :'UPDATE' => :'LocalInventoryUpdateOperation',
#   :'UPSERT' => :'LocalInventoryUpsertOperation'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::LocalInventoryOperation.build(data)
# => #<LocalInventoryCreateOperation:0x00007fdd4aab02a0>

PinterestSdkClient::LocalInventoryOperation.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `LocalInventoryCreateOperation`
- `LocalInventoryDeleteOperation`
- `LocalInventoryUpdateOperation`
- `LocalInventoryUpsertOperation`
- `nil` (if no type matches)

